package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.junit.Test;
import com.example.demo.param.userParam;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public  void test(){

        userParam userParam = new userParam();
        userParam.setUserName("aa");
        userParam.setCurrentPage(0);
        List<User> users = userMapper.getList(userParam);
        long count = userMapper.getCount(userParam);


        System.out.println(users);
        System.out.println("总数="+count);
    }
}

