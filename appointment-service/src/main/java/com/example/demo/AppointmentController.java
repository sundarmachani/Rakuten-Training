package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	@GetMapping
	void getAppointment() {
		System.out.println("appointment");
	}
	@PostMapping
	void postAppointment() {
		System.out.println("post method");
	}

}
