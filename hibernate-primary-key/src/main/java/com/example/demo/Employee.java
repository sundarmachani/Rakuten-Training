package com.example.demo;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "employees")
public class Employee {
	
	@EmbeddedId
	private EmployeeId employeeId;
	
	@NotNull
	@Size(max = 50)
	private String name;
	
	@NaturalId
	@NotNull
	@Email
	@Size(max = 30)
	private String email;
	
	@Size(max = 15)
	@Column(name = "phone_number", unique = true)
	private String phoneNumber;
	
	
	public Employee() {
		
	}

	public Employee(EmployeeId employeeId,String name, String email, String phoneNumber) {
		this.name = name;
		this.employeeId = employeeId;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public EmployeeId getEmployeeid() {
		return employeeId;
	}

	public void setEmployeeid(EmployeeId employeeid) {
		this.employeeId = employeeid;
	}
}
