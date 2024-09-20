package com.example.springboot_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemo1Application {

	public static void main(String[] args) {
		System.out.println("Starting application...");
		System.out.println("11...");
		SpringApplication.run(SpringbootDemo1Application.class, args);
		System.out.println("Application started.");
	}


}
