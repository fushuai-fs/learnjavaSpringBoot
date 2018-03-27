package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/")
    public String login() {
//        map.addAttribute("message", "http://www..com");
        return "login";
    }


}
