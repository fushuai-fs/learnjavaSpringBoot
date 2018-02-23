package com.example.demo.web;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebController {
    @RequestMapping(path = "/getUser")
    public User getUser(){

        User user = new User();
        user.setUserName("付帅");
        user.setAge(28);
        user.setPassWord("123456");
        return  user;
    }
    @RequestMapping("/getUsers")
    public List<User> getUsers() {

        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setUserName("fushuainame");
        user1.setAge(30);
        user1.setPassWord("fushuai");
        users.add(user1);
        User user2 = new User();
        user2.setUserName("小明");
        user2.setAge(12);
        user2.setPassWord("123456");
        users.add(user2);
        return  users;
    }

    @RequestMapping(path = "/setParams")
    public String setUser(User user){
        return "setParams"+ user.toString();
    }
    @RequestMapping("/setUser")
    public String setUser1(User user){
        return  "setUser"+user.toString();
    }
    @RequestMapping(value="get/{name}", method=RequestMethod.GET)
    public User get(@PathVariable String name) {
        User user=new User();
        user.setUserName(name);
        return user;
    }

}
