package com.example.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;

import java.lang.reflect.Method;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

    @Bean
    public KeyGenerator keyGenerator(){
        return  new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... objects) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(target.getClass().getName());
                stringBuilder.append(method.getName());
                for (Object obj: objects) {
                    stringBuilder.append(obj.toString());
                }
                return stringBuilder.toString();
            }
        };
    }

    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate){
        RedisCacheManager redisCacheManager = new RedisCacheManager(redisTemplate);
        //设置缓存过期时间
        //rcm.setDefaultExpiration(60);//秒
        return  redisCacheManager;
    }
}
