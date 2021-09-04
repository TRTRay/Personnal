package com.example.userloginin;

import com.example.userloginin.pojo.User;
import com.example.userloginin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UserServiceTests {
    @Autowired
    UserService service;

    @Test
    public void insert(){
        User user = new User("guanyu", "456");
        service.insert(user);
        System.err.println("Register succeed!");
    }
}
