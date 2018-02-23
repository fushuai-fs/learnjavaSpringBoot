package com.example.demo.web;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class WebConfiguration {

    @Bean
    public RemoteIpFilter RemoteIpFilter(){
        return  new RemoteIpFilter();
    }
    @Bean
    public FilterRegistrationBean filterRegistration(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("paramValue","paramValue");
        registrationBean.setName("myFilter");
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
