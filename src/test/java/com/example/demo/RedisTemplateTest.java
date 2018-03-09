package com.example.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTemplateTest {


    RedisTemplate redisTemplate;
    @Autowired
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        RedisSerializer stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setValueSerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
        this.redisTemplate = redisTemplate;
    }
    @Bean
    public RedisTemplate redisTemplateInit() {
        //设置序列化Key的实例化对象
//        //设置序列化Value的实例化对象
//        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        return redisTemplate;
    }
    @Test
    public void tests(){
         redisTemplate.opsForValue().set("keyss","study javaaaaaaaaaaaaaa");

//        Assert.assertEquals("test",redisTemplate.opsForValue().get("keys"));

        Object object = redisTemplate.opsForValue().get("keyss");

        System.out.println(object);

    }


}
