package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactUsController {
	
	@Autowired
	ContactUsService contactservice;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void sendMessage(@RequestBody ContactUs message) {
		contactservice.send(message);
	}

}
