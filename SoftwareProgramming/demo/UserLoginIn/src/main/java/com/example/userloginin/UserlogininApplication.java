package com.example.userloginin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.userloginin.mapper")
public class UserlogininApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserlogininApplication.class, args);
	}

}
