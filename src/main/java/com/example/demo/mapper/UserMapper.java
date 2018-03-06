package com.example.demo.mapper;
import com.example.demo.domain.User;
import com.example.demo.param.userParam;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    @Results({
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "passWord", column = "pass_word"),
            @Result(property = "regTime", column = "reg_time")
    })
    default List<User> getAll() {
        return null;
    }
    @SelectProvider(type = UserSql.class, method = "getList")
    @Results({
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "passWord", column = "pass_word"),
            @Result(property = "regTime", column = "reg_time")
    })
    List<User> getList(userParam userParam);

    @SelectProvider(type = UserSql.class, method = "getCount")
    int getCount(userParam userParam);

    @Select("select * from user where id = #{id}")
    @Results({
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "userName", column = "user_name"),
            @Result(property = "passWord", column = "pass_word"),
            @Result(property = "regTime", column = "reg_time")
    })
    default User getOneUser(long id) {
        return null;
    }


    @Insert("insert into test.user (email,nick_name,pass_word,reg_time,user_name,age) " +
            " values(#{email},#{nickName},#{passWord},#{regTime},#{userName},#{age})")
    int Insert(User user);

    @Update("update user set email=#{email},nick_name=#{nickName},pass_word=#{passWord},reg_time=#{regTime},user_name=#{userName},age=#{age} " +
            "where id=#{id}")
    int Update(User user);

    @Delete("delete from user where id=#{id}")
    int Delete(long id);
}
