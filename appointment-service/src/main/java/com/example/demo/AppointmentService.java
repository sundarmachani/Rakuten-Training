package com.example.demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
	List<Appointment> appointments = new ArrayList<>();
	public void makeAppointment(Appointment appointment) {
		appointments.add(appointment);
	}
	
	List<Appointment> getAllAppointments() {
		return appointments;
	}
	
	public List<Appointment> getAppointmentByCustomerName(String customerName) {
		return appointments.stream().filter(appoint -> appoint.getCustomer().getName().equals(customerName)).collect(Collectors.toList());
	}
	public List<Appointment> getAppointmentByPhoneNumber(BigInteger phone) {
		return appointments.stream().filter(appoint -> appoint.getCustomer().getPhone().equals(phone)).collect(Collectors.toList());
	}
}
