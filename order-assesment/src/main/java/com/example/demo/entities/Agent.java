package com.example.demo.entities;

import java.util.Date;

public class Agent {
	private String agentId, loginId, lastName, FirstName, password, email, phoneNumber, addressLine1, addressLine2, state,country, pinCode,defaultStore;
	private Date dateOfBirth;
	private boolean isActive, isAdmin;
	private int defaultPageSize;
	
	
	public Agent(String agentId, String loginId, String lastName, String firstName, String password, String email,
			String phoneNumber, String addressLine1, String addressLine2, String state, String country, String pinCode,
			String defaultStore, Date dateOfBirth, boolean isActive, boolean isAdmin, int defaultPageSize) {
		super();
		this.agentId = agentId;
		this.loginId = loginId;
		this.lastName = lastName;
		FirstName = firstName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
		this.defaultStore = defaultStore;
		this.dateOfBirth = dateOfBirth;
		this.isActive = isActive;
		this.isAdmin = isAdmin;
		this.defaultPageSize = defaultPageSize;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getDefaultStore() {
		return defaultStore;
	}
	public void setDefaultStore(String defaultStore) {
		this.defaultStore = defaultStore;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public int getDefaultPageSize() {
		return defaultPageSize;
	}
	public void setDefaultPageSize(int defaultPageSize) {
		this.defaultPageSize = defaultPageSize;
	}


}
