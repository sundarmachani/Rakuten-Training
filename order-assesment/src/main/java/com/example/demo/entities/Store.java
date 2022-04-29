package com.example.demo.entities;

public class Store {
	private String storeId, storeName, adressLine1, adressLine2, state, country, pinCode, phoneNumber,email;

	
	public Store(String storeId, String storeName, String adressLine1, String adressLine2, String state, String country,
			String pinCode, String phoneNumber, String email) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.adressLine1 = adressLine1;
		this.adressLine2 = adressLine2;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getAdressLine1() {
		return adressLine1;
	}

	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}

	public String getAdressLine2() {
		return adressLine2;
	}

	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
