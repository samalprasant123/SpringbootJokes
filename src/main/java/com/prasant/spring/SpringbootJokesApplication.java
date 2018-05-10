package com.prasant.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.prasant.spring.services.JokesServiceImpl;

@SpringBootApplication
public class SpringbootJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJokesApplication.class, args);
	}
}
