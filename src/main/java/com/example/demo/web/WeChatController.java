package com.example.demo.web;

import com.example.demo.domain.WeChatCertEntity;
import com.sun.javafx.collections.MappingChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WeChatController {

    @Autowired
    private RestTemplate restTemplate;


    private String APPID;
    private String SECRET;
    @RequestMapping("/login")
    public Object OnLogin(String code){
        String url ="https://api.weixin.qq.com/sns/jscode2session?appid={APPID}&secret={SECRET}&js_code={JSCODE}&grant_type=authorization_code";
        Map<String,Object> map = new HashMap<>();
        map.put("APPID",APPID);
        map.put("SECRET",SECRET);
        map.put("JSCODE",code);
        WeChatCertEntity weChat = restTemplate.getForObject(url,WeChatCertEntity.class,map);
        if(weChat.getErrcode()>0)
        {
            return  new Object(){};
        }
        // 生成session
        String session="";
        // redis 存储session

        // 返回session
        Map<String,Object> result = new HashMap<>();
        result.put("session",session);

        return  result;

    }

}
