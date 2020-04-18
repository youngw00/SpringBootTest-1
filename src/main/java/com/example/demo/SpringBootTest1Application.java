package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTest1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootTest1Application.class, args);
		SpringApplication application = new SpringApplication(SpringBootTest1Application.class);
		application.run(args);
	}

}
