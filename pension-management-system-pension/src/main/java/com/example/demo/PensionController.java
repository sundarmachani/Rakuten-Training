package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/Pension")
public class PensionController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	PensionService service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	Pension getPensionRequest(@RequestBody Aadhar input) {
		System.out.println(input.getAadharNumber());
		
		PensionerDetails pensionerDetail = restTemplate.getForObject("http://PENSIONER-DETAIL/pensionerDetailByAadhar?aadharNumber=" + input.getAadharNumber(), PensionerDetails.class);
		if(!pensionerDetail.isValid()) {
			System.out.println("Not valid");
			return new Pension(-1,-1);
		}
		return service.pensionCalculator(pensionerDetail);
	}
	

}
