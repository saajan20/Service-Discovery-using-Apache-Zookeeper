package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/Best-Employee")
	public Employee get() {
		return new Employee(440,"Saajan Kumar Jha", "Intern");
	}

}
