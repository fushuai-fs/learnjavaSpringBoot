package com.example.demo;

import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class restTemplateTest {
   @Autowired
    private RestTemplate restTemplate;


    @Test
    public void testconfig(){
        Object object = this.restTemplate.postForObject("http://172.16.2.162:801/api/App/hotel","",Object.class);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(object);
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }


/**
 * RestTemplate restTemplate = new RestTemplate();
 * */
    @Test
    public void test(){
//        RestTemplate restTemplate = new RestTemplate();
//        Object object = restTemplate.postForObject("http://172.16.2.162:801/api/App/hotel","",Object.class);
//
//        System.out.println(object);
    }
}
