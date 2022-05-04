package com.example.demo;

import java.math.BigInteger;

public class ContactUs {
	private String name;
	private BigInteger phone;
	private String email;
	
	public ContactUs(String name, BigInteger phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public String getName() {
	return name;
	}
	public BigInteger getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	public void message(ContactUs message) {	
	System.out.println(message);
}

}
