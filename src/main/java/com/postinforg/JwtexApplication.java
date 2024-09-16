package com.postinforg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class JwtexApplication {
	public static void main(String[] args) {
		SpringApplication.run(com.postinforg.JwtexApplication.class, args);
		
		System.out.println(">>> start ");
	}
}
