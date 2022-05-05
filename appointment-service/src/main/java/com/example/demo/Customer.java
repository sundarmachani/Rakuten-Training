package com.example.demo;

import java.math.BigInteger;

public class Customer {
	private int CustomerId;
	private String name;
	private int age;
	private BigInteger phone;
	private String email;
	
	public int getCustomerId() {
		return CustomerId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	
	public Customer(int customerId, String name, int age, BigInteger phone, String email) {
		super();
		this.CustomerId = customerId;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}	
	
	@Override
	public String toString() {
		return String.format("CustomerId = %s, Name = %s,Age = %d, Mobile Number= %s,Email = %s\",", this.getCustomerId(),this.getName(),this.getAge(),this.getPhone(),this.getEmail());
	}
}
