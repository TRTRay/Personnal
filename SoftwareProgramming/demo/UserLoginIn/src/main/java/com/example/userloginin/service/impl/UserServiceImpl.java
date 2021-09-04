package com.example.userloginin.service.impl;

import com.example.userloginin.mapper.UserMapper;
import com.example.userloginin.pojo.User;
import com.example.userloginin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public void insert(User user){
        Integer rows = mapper.addnew(user);
        System.err.println("New user row = " + rows);
    }
}
