package com.example.demo;

import java.math.BigInteger;
import java.util.List;

public class SetCustomerFile {
	public static List<Appointment> setCustomerEntityFromData(AppointmentRepository appointmentrepository, List<Appointment> appointmentData){
		appointmentData = appointmentrepository.findAll();
		
		appointmentData.forEach(singleAppointment -> {
			String[] changeDataTo = singleAppointment.getCustomerFile().split(",");
			int customerId = Integer.valueOf((changeDataTo)[1].split("=")[1].trim());
			String name = changeDataTo[0].split("=")[1].trim();
			int age = Integer.valueOf(changeDataTo[1].split("=")[1].trim());
			BigInteger phone = new BigInteger(changeDataTo[2].split("=")[1].trim());
			String email = changeDataTo[3].split("=")[1].trim();
			
			singleAppointment.setCustomer(new Customer(customerId, name, age, phone, email));
		});
		
		return appointmentData;
	}

}
