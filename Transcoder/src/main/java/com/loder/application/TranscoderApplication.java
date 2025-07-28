package com.loder.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.loder")
public class TranscoderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TranscoderApplication.class, args);
	}

}
