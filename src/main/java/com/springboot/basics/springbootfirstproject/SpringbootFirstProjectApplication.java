package com.springboot.basics.springbootfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringbootFirstProjectApplication.class, args);
		for(String s : appContext.getBeanDefinitionNames())
			System.out.println(s);
	}
}
