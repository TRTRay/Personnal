package com.example.userloginin.controller;

import com.example.userloginin.pojo.User;
import com.example.userloginin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("register")
    @ResponseBody
    public String registerHandler(User user)
    {
        service.insert(user);
        return "Register succeed!";
    }
}
