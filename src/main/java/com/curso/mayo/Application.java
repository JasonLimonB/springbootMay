package com.curso.mayo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* The annotation @SpringBootApplication has an equivalent with other annotations like:
* @Configuration
* @ComponentScan
* @EnableAutoConfiguration
* */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
