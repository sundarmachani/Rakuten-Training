package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactUsService {

	@Autowired
	ContactRepository contactrepository;
	
	public void send(ContactUs message) {
		contactrepository.save(message);
	}
	
	public List<ContactUs> getAllContacts() {
		return contactrepository.findAll();
	}

}
