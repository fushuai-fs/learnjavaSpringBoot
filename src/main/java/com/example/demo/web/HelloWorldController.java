package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return  "hello world";
    }
    @RequestMapping("/hello1")
    public String helloWorld1(){
        return  "hello helloWorld1";
    }
    @RequestMapping("/hello2")
    public String helloWorld2(){
        return  "hello helloWorld2";
    }
    @RequestMapping("/hello3")
    public String helloWorld3(){
        return  "hello helloWorld3";
    }
}
