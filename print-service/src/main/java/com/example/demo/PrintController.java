package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/print")
public class PrintController {
	@GetMapping
	void getmessage() {
		System.out.println("get method");
		
	}
	@PostMapping
	void postmessage() {
		System.out.println("post method");
	}
}