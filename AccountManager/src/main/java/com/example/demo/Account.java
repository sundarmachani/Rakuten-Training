package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")

public class Account {
	private enum TYPE {
		SAVINGS, CURRENT;

	}

	private enum STATUS {
		ACTIVE, INACTIVE, CLOSED;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TYPE")
	private TYPE type;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	private STATUS status;
	
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	public TYPE getType() {
		return type;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}


	private String ownerName;
	private Integer age;
	private String emailId;
	private Date openingDate;
	private Integer accountNumber;
	private Integer phoneNumber;
	private String address;
	private Integer balance;
	
	
	public long withdraw(int amount) {
		if(amount > this.getBalance()) {
			throw new IllegalArgumentException("Low Balance, the current balance is " + this.getBalance());
		}
		
		this.setBalance(this.getBalance() - amount);
		return this.getBalance();
	}
	
	public long deposit(int amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Amount should not be negative, the entered amount is " + amount);
		}
		this.setBalance( amount + this.getBalance() );
		return this.getBalance();
	}
	

}
