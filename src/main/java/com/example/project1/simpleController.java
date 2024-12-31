package com.example.project1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class simpleController {

	@GetMapping("/simple")
	public String user() {
		return "simple project ! Spring Boot";
	}
	
}
