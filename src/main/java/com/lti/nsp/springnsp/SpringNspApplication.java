package com.lti.nsp.springnsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lti.nsp") 
@EntityScan("com.lti.nsp.entity")
public class SpringNspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNspApplication.class, args);
		System.out.println("Hello Bro! I started the project! You too start it.");
	}
}
