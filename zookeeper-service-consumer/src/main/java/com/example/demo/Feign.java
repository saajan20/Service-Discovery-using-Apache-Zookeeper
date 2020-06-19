package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
@EnableFeignClients
public class Feign {

	@Autowired
	private TheClient client;
	
	@FeignClient(name = "zookeeper")
    interface TheClient {
		
		@GetMapping("/Best-Employee")
		public Employee get();
		
	}
	
	public Employee emp() {
		return client.get();
	}
	
	
	
}
