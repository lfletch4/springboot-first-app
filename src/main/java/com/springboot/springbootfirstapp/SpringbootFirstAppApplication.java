package com.springboot.springbootfirstapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootFirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootFirstAppApplication.class, args);
//		
//		Alien a = context.getBean(Alien.class);
//		
//		a.show();
//		
	}

}
