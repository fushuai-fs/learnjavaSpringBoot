package com.example.demo.web;

import com.example.demo.domain.WeChatCertEntity;
import com.example.demo.utils.RedisUtil;
import com.sun.javafx.collections.MappingChange;
import org.apache.commons.lang3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WeChatController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RedisUtil redisUtil;

    private String APPID="wx313f3b8003e20d3e";
    private String SECRET="1ca6fc9cc0258df557c0ea0aa0635f6f";
    @RequestMapping("/login")
    public Object OnLogin(String code){

        // 返回session
        Map<String,Object> result = new HashMap<>();

        String url ="https://api.weixin.qq.com/sns/jscode2session?appid={APPID}&secret={SECRET}&js_code={JSCODE}&grant_type=authorization_code";

        Map<String,Object> map = new HashMap<>();
        map.put("APPID",APPID);
        map.put("SECRET",SECRET);
        map.put("JSCODE",code);

        WeChatCertEntity weChat =null;
        try {
            // 添加text/plan转换实体类型才可以  或者 接收字符串转换
            ResponseEntity<WeChatCertEntity> rs = restTemplate.getForEntity(url,WeChatCertEntity.class,map);
            weChat =rs.getBody();
            result.put("msg","success");
        }catch (Exception e){
            System.out.println(e.toString());
        }
        if(weChat==null || weChat.getErrcode()>0)
        {
            result.put("msg",weChat==null?"error":weChat.getErrcode()+"#"+weChat.getErrmsg());
            return  result;
        }
        // 生成session
        String session=this.create3rdSession(weChat.getOpenid(),weChat.getSession_key(),(long)10*60);
        // redis 存储session

        result.put("session",session);

        return  result;

    }

    /**
     * 缓存微信openId和session_key
     * @param wxOpenId		微信用户唯一标识
     * @param wxSessionKey	微信服务器会话密钥
     * @param expires		会话有效期, 以秒为单位
     * @return
     */
      String create3rdSession(String wxOpenId, String wxSessionKey, Long expires){
        String thirdSessionKey = Long.toString(RandomUtils.nextLong());
        StringBuffer sb = new StringBuffer();
        sb.append(wxSessionKey).append("#").append(wxOpenId);
        redisUtil.add(thirdSessionKey, expires, sb.toString());
        return thirdSessionKey;
    }

}
