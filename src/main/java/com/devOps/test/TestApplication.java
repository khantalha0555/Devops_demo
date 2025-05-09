package com.devOps.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
	
	public String message() {
		return "Welcome to DevOps";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
