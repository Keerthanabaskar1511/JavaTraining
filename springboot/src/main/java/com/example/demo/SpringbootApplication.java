package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.*;
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		
	ApplicationContext context =	SpringApplication.run(SpringbootApplication.class, args);
	
	Employee emp  = context.getBean("e1",Employee.class);
	
	System.out.println(emp);
	 
	
	
	}

}