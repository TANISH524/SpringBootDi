package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TanishPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(TanishPracticeApplication.class, args);
		
		 Laptop laptop = context.getBean(Laptop.class);
	    Alien a = context.getBean(Alien.class);
	    System.out.println("main activity");
	    
	    a.Show();
	}

}
