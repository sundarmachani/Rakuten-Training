package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class Subcription {
	@GetMapping
	void unsubscribed() {
		System.out.println("Normal customer / Non-membership");

	}
	
	void subcribed() {
		System.out.println("Subscribed member / Paid membership");

	}
}
