package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoCaronaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoCaronaApplication.class, args);
		
		System.out.println("Web App is running");
	}

}
