package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PensionerDetailsController {
	
	@Autowired
	PensionerDetailService service;
	@GetMapping("/pensionerDetailsByAadhar")
	PensionerDetails getPensionerDetails(@RequestParam String aadhar) {
		System.out.println(aadhar);
		return service.getPensionerDetails(aadhar);
	}
}
