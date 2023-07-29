package com.example.DogDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DogDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(DogDemoApplication.class, args);
			System.out.println("Hello, Spring Boot!");
			System.out.println("Good Bye, Corona!");
			
			Dog d1 = appContext.getBean(Dog.class);
			Trainer t1 = appContext.getBean(Trainer.class);
			t1.setId(23);
			t1.setName("John");
			
			System.out.println(d1);
			d1.setId(12);
			d1.setName("puppy");
			d1.setBreed("pug");
			d1.setTrainer(t1);
			System.out.println(d1);	
			
			Dog d2 = appContext.getBean(Dog.class);
			System.out.println(d2);
			d2.setId(121);
			d2.setName("puppy1");
			d2.setBreed("pug1");
			d2.setTrainer(t1);
			System.out.println(d2);	
			//System.out.println(d1);	
			
			
	}

}