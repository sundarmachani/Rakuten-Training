package com.example.demo;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
	@Autowired
	AppointmentRepository appointmentrepository;
	List<Appointment> appointments;
	
	public void makeAppointment(Appointment appointment) {
		String customerLine = appointment.getCustomer().toString();
		appointment.setCustomerFile(customerLine);
		appointmentrepository.save(appointment);	
	}
	
	List<Appointment> getAllAppointments() {
		return appointmentrepository.findAll();
	}
	
	public List<Appointment> getAppointmentByCustomerName(String customerName) {
		return appointments.stream().filter(appoint -> appoint.getCustomer().getName().equals(customerName)).collect(Collectors.toList());
	}
	public List<Appointment> getAppointmentByPhoneNumber(BigInteger phone) {
		return appointments.stream().filter(appoint -> appoint.getCustomer().getPhone().equals(phone)).collect(Collectors.toList());
	}

	public void updateAppointmentById(Appointment updateAppointment, Integer id) {
		System.out.println(updateAppointment);
		updateAppointment.setId(id);
		appointmentrepository.save(updateAppointment);
	}
	public void deleteAppointmentById(Integer id) {
		appointmentrepository.deleteById(id);		
	}
}
