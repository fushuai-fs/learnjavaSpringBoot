package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class indexController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("message", "http://www.idonotknow.com");
        return "example";
    }
    @RequestMapping("/index")
    public String index(){
        return  "index";
    }
    @RequestMapping("/layout")
    public String layout() {
        return "layout";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

}
