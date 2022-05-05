package com.example.demo;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactus")
public class ContactUs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name, message;
	private BigInteger phone;
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("Name = %s, Phone = %d, Mail = %s, \n Message = %s", this.getName(),this.getPhone(),this.getEmail(),this.getMessage());
	}
}
