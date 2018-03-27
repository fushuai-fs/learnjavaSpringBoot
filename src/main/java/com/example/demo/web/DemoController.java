package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面导航 */
@Controller
public class DemoController {
    @RequestMapping("/index")
    public String index(){
        return  "index";
    }
    @RequestMapping("/")
    public String login() {
        return "login";
    }


//    @RequestMapping("/example")
//    public String index(ModelMap map) {
//        map.addAttribute("message", "http://www..com");
//        return "example";
//    }

//    @RequestMapping("/layout")
//    public String layout() {
//        return "layout";
//    }
//
//    @RequestMapping("/home")
//    public String home() {
//        return "home";
//    }
//
//    @RequestMapping("/layoutHeader")
//    public String layoutHeader(){
//        return "layout/header";
//    }
}
