package com.example.demo.mapper;

import com.example.demo.param.userParam;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.ibatis.jdbc.SQL;


public class UserSql {
    private static final Logger log = LoggerFactory.getLogger(UserSql.class);

    public String getList(userParam userParam) {
        StringBuffer sql = new StringBuffer("select id, userName, passWord, user_sex as userSex, nick_name as nickName");
        sql.append(" from user where 1=1 ");
        if (userParam != null) {
            if (StringUtils.isNotBlank(userParam.getUserName())) {
                sql.append(" and userName = #{userName}");
            }
            if (StringUtils.isNotBlank(userParam.getUserSex())) {
                sql.append(" and userSex = #{userSex}");
            }
        }
        sql.append(" order by id desc");
        sql.append(" limit " + userParam.getBeginLine() + "," + userParam.getPageSize());
        log.info("getList sql is :" +sql.toString());
        return sql.toString();
    }

    public String getCount(userParam userParam){
//        StringBuffer sql = new StringBuffer();
//        sql.append("select count(1) from user where 1=1 ");
//        if (userParam != null) {
//            if (StringUtils.isNotBlank(userParam.getUserName())) {
//                sql.append(" and userName = #{userName}");
//            }
//            if (StringUtils.isNotBlank(userParam.getUserSex())) {
//                sql.append(" and userSex = #{userSex}");
//            }
//        }

        String sqls = new SQL(){{
           SELECT ("count(1)");FROM("user");
           if(StringUtils.isNotBlank(userParam.getUserName())){
               WHERE("user_name=#{userName}");
           }
           if(StringUtils.isNotBlank(userParam.getUserSex())){
               WHERE("user_sex= #{userSex}");
           }
        }}.toString();
        return  sqls;
    }


}
