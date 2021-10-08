package com.zh.web01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @RequestMapping("/1.jpg")
    public String hello(){
        return "hello word";
    }
}
