package com.will.example.spring.boot.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@ImportResource(locations = "classpath:applicationContext.xml")
@EnableRetry
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
