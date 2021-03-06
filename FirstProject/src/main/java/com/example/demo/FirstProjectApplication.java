package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FirstProjectApplication.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		
		// we will get object from bean but we have to tell the bean to create object
		// for that singleton, prototype object which type we want, we need to specify
		//by @component or @prototype in pojo(Alien) class
		//@component is a singleton object created in spring container and 
		// get bean will deliver the object ie "object created" will display only once
		//in prototype multiple objects created and created when you will type  getBean
		
		Alien a = context.getBean(Alien.class);
		
		a.show();
		
//		Alien a1 = context.getBean(Alien.class);
//		
//		a1.show();
		
		
	}

}
