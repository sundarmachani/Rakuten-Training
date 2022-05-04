package com.example.demo;

import java.util.ArrayList;
import java.util.List;

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
	
	public Appointment getAppointmentByCustomerName(String customerName) {
		for(Appointment slot : appointments) {
			if(slot.getCustomer().getName().equals(customerName)) {
				return slot;
			}
		}
		return new Appointment();
	}
}
