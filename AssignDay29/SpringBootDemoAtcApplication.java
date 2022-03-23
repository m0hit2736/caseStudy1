package com.ia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication //same as @Configuration @EnableAutoConfiguration. @Componentscan
public class SpringBootDemoAtcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoAtcApplication.class, args);
	}


}
