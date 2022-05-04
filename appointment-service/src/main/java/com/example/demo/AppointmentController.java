package com.example.demo;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentservice;
	
	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createAppointment(@RequestBody Appointment appointment) {
		System.out.println(appointment);
		appointmentservice.makeAppointment(appointment);
	}
	@GetMapping("/show")
	List<Appointment> bringAllAppointments() {
		return appointmentservice.getAllAppointments();
	}
	
	@GetMapping("/show/name/{name}")
	List<Appointment> getAppointmentByName(@PathVariable String name) {
		return appointmentservice.getAppointmentByCustomerName(name);
	}
	
	@GetMapping("/show/phone/{phone}")
	List<Appointment> getAppointmentByPhone(@PathVariable BigInteger phone) {
		return appointmentservice.getAppointmentByPhoneNumber(phone);
	}
}
