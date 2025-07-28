package com.loder.adapters.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Controller{

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

		@RequestMapping("/error")
	String error() {
		return "bha!";
	}

}