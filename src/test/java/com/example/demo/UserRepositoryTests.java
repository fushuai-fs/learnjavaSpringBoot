package com.example.demo;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Resource
    private UserRepository userRepository;

//    @Before
//    public  void setUp(){
//        System.out.println("-----> SETUP <-----");
//    }

    @Test
    public void testSave() throws  Exception {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        userRepository.save(new User("aa", "aa@126.com", "aaa", "aa123456",dateFormat.format(new Date()),8));
        userRepository.save(new User("bb", "bb@126.com", "bbb", "bb123456",dateFormat.format(new Date()),9));
        userRepository.save(new User("cc", "cc@126.com", "ccc", "cc123456",dateFormat.format(new Date()),10));
        userRepository.save(new User("ee", "dd@126.com", "ddd", "dd123456",dateFormat.format(new Date()),22));

//        Assert.assertEquals(2,userRepository.findAll().size());
//        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
//
//        userRepository.delete(userRepository.findByUserName("aa"));
//          User user = userRepository.findByUserName("aa");
//          System.out.println(user);
    }
}
