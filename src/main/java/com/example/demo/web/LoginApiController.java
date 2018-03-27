package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginApiController {
    @RequestMapping(value = "/userLogin",method = {RequestMethod.POST})
    public Map<String, Object> login(HttpServletRequest request, String userName, String password) {
        System.out.println(userName);
        System.out.println(password);

        request.getSession().setAttribute("message", userName);

        Map<String,Object> map = new HashMap<>();
        map.put("msg","success");
        map.put("userName",userName);
        return map;
    }
}
