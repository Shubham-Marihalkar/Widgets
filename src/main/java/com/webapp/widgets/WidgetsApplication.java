package com.webapp.widgets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class WidgetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WidgetsApplication.class, args);
		System.out.println("Web app stated");
	}
	
}
