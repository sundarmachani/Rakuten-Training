package com.example.demo;

public class Address{
	private String FlatNumber, street, city, state, country;
	private int zipcode;
	
	public Address(String flatNumber, String street, String city, String state, String country, int zipcode) {
		super();
		this.FlatNumber = flatNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
	}
	
	public String getFlatNumber() {
		return FlatNumber;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public int getZipcode() {
		return zipcode;
	}	
	
	@Override
	public String toString() {
		
		return String.format("FlatNumber : %s \n Street : %s \n City : %s \n State : %s \n Country : %s \n ZipCode : %d",this.getFlatNumber(),this.getStreet(),this.getCity(),this.getState(),this.getCountry(),this.getZipcode());
	}
}
