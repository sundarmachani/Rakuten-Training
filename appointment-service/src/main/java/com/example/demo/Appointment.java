package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "appointments")
public class Appointment {
	private enum STATUS {
		PENDING, CONFIRMED, CANCELLED;
	}
	private enum THERAPIST_REQUEST {
		MALE, FEMALE, NO_REQUIREMENT;
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private STATUS status;
	private Date date;
	private String time,customerFile;
	@Transient
	private Customer customer;
	@Transient
	private Package packageDetails;
	private THERAPIST_REQUEST therapist;
	
	public THERAPIST_REQUEST getTherapist() {
		return therapist;
	}
	public void setTherapist(THERAPIST_REQUEST therapist) {
		this.therapist = therapist;
	}
	public String getCustomerFile() {
		return customerFile;
	}
	public void setCustomerFile(String customerFile) {
		this.customerFile = customerFile;
	}
	
	public Package getPackageDetails() {
		return packageDetails;
	}
	public void setPackageDetails(Package packageDetails) {
		this.packageDetails = packageDetails;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		setCustomerFile(customer.toString());
		return String.format("Customer Details = \n %s Therapist requested = %s \n Package Details = %s \n Duration in weeks = %d", this.getCustomer(),getTherapist(),this.getPackageDetails(),this.getPackageDetails().getPlanDuratinInWeeks());
	}
	
}
