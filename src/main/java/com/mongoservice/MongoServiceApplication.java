package com.mongoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MongoServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MongoServiceApplication.class, args);
//
//		PersonRepo personRepo = context.getBean(PersonRepo.class);
//		Document personList = personRepo.getByabc();
//
//		PersonService personService = context.getBean(PersonService.class);
//		Object object = personService.abcd();
//
//		System.out.println(personRepo);

	}

}
