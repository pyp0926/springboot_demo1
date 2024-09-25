package com.example.springboot_demo1;

import com.example.springboot_demo1.example.mapper.QbKeyMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.example.springboot_demo1.example.mapper")
@EnableCaching
public class SpringbootDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo1Application.class, args);
		System.out.println("Application started.");
	}


}
