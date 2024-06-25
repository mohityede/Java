package com.themohit.DI_project;

import com.themohit.DI_project.model.Laptop;
import com.themohit.DI_project.model.Programmer;
import com.themohit.DI_project.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DiProjectApplication.class, args);

		LaptopService service=context.getBean(LaptopService.class);
		Laptop lap=context.getBean(Laptop.class);
		lap.compile();

		service.addLaptop(lap);
		System.out.println(service.isGoodForCoding());

//		System.out.println("My fist spring boot application...");
//		Programmer dev=context.getBean(Programmer.class);
//		System.out.println(dev.getAge());
//		dev.code();
	}

}
