package com.example.demo.entities;

import java.util.Date;

public class CustomerAddress {
	private boolean isBillingAdress;
	private Date creationDate;
	private String customerId, addressLine1, addressLine2, state, phoneNumber,country, pinCode;
	
	public CustomerAddress(boolean isBillingAdress, Date creationDate, String customerId, String addressLine1,
			String addressLine2, String state, String phoneNumber, String country, String pinCode) {
		super();
		this.isBillingAdress = isBillingAdress;
		this.creationDate = creationDate;
		this.customerId = customerId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.pinCode = pinCode;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public boolean isBillingAdress() {
		return isBillingAdress;
	}
	public void setBillingAdress(boolean isBillingAdress) {
		this.isBillingAdress = isBillingAdress;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	

}
