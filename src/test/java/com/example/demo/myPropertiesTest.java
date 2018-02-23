package com.example.demo;

import com.example.demo.web.myProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class myPropertiesTest {
    @Resource
    myProperties myProperties;
    @Test
    public void testProperties() throws Exception {
        System.out.println("title:"+myProperties.getTitle());
        System.out.println("description:"+myProperties.getDescription());
    }
}
