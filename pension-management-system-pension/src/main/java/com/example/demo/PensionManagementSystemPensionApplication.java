package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class PensionManagementSystemPensionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PensionManagementSystemPensionApplication.class, args);
	}
	
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
