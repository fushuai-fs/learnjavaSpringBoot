package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping(path = "/siderBar",method = {RequestMethod.GET})
    public Map<String, Object> siderBar(HttpServletRequest request, int ID) {

        Map<String,Object> map = new HashMap<>();
        map.put("msg","success");
        return map;
    }

}
