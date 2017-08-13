package com.lrs.jetty.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class App {

	@GetMapping("/")
	public String hello() {
		return "<h1>Hello Spring boot Jetty!</h1>";

	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	
}
