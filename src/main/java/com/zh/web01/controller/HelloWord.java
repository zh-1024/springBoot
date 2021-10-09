package com.zh.web01.controller;

import com.zh.web01.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @RequestMapping("/1.jpg")
    public String hello(){
        System.out.println("hello");
        return "hello word";
    }
    @GetMapping("/user")
    public void getUser(User user){
        System.out.println(user);
    }
}
