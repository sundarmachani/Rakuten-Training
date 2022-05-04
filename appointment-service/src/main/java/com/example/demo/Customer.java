package com.example.demo;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
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

	
	public Customer(int customerId, String name, int age, String address, BigInteger phone, String email) {
		super();
		CustomerId = customerId;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}	
}
