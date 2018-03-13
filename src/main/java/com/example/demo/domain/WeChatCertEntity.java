package com.example.demo.domain;

import javax.persistence.Entity;

/*
* //正常返回的JSON数据包
{
      "openid": "OPENID",
      "session_key": "SESSIONKEY",
      "unionid": "UNIONID"
}
//错误时返回JSON数据包(示例为Code无效)
{
    "errcode": 40029,
    "errmsg": "invalid code"
}
*/

public class WeChatCertEntity {
    //用户唯一标识
    private String openid;
    //会话密钥
    private String session_key;

    //用户在开放平台的唯一标识符。本字段在满足一定条件的情况下才返回.具体参看UnionID机制说明
    private String unionid;

    private int errcode;

    private String errmsg;


    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}
