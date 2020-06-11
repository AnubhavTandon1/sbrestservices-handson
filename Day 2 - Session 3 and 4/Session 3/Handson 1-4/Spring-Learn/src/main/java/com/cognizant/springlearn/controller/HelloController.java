package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/hello")
	public String sayHello() {
		LOGGER.info("Inside sayHello");
		LOGGER.info("END");
		return "Hello World!";

	}
	
	
	

}
