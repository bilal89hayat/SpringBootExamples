package com.example.spring.SpringExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication(scanBasePackages= {"com.example.spring"})
public class SpringExampleApplication {
	
	
	
	@RequestMapping("/")
	String home() 
	{
		return "This is inside main class.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}
}
