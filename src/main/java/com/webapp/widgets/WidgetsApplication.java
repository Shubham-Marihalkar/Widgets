package com.webapp.widgets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class WidgetsApplication {
	
	public static final Logger logger = LoggerFactory.getLogger(WidgetsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(WidgetsApplication.class, args);
		logger.info("Widgets Application");
	}
	
}
