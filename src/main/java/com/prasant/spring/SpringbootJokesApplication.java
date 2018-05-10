package com.prasant.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.prasant.spring.services.JokesServiceImpl;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringbootJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJokesApplication.class, args);
	}
}
