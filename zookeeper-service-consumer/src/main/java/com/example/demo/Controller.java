package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
	
	@Autowired
	private Feign call;
	
	
	@GetMapping("/Best-Employee")
	public Employee get() {
		
		return call.emp();
		
	}

}
