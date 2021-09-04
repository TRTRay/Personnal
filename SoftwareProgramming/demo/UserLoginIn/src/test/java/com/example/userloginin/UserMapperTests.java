package com.example.userloginin;

import com.example.userloginin.mapper.UserMapper;
import com.example.userloginin.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTests {

    @Autowired
    UserMapper mapper;

    @Test
    public void addnew()
    {
        User user = new User("zhaoyun", "123");
        Integer rows = mapper.addnew(user);
        System.err.println("New User row = " + rows);
    }
}
