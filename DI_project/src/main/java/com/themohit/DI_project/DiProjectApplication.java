package com.themohit.DI_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DiProjectApplication.class, args);
		System.out.println("My fist spring boot application...");
		Programmer dev=context.getBean(Programmer.class);
		dev.code();
	}

}
