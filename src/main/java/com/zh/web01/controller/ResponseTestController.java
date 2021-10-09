package com.zh.web01.controller;


import com.zh.web01.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class ResponseTestController {
    @ResponseBody
    @GetMapping("/user")
    public User getUser(){
        return new User("zh", 12);
    }
}
