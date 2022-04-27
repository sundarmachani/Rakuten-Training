package com.example.demo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class EmployeeId implements Serializable{
	@NotNull
	@Size(max = 15)
	private String employeeId;
	
	@NotNull
	@Size(max=15)
	private String companyId;
	
	public EmployeeId() {
		
	}
	
	public EmployeeId(String employeeId, String companyId) {
		this.employeeId = employeeId;
		this.companyId = companyId;
	}
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		EmployeeId that = (EmployeeId) o;
		
		if(!employeeId.equals(that.employeeId)) return false;
		return companyId.equals(that.companyId);
	}
	@Override
	public int hashCode() {
		int result = employeeId.hashCode();
		result = 31 * result + companyId.hashCode();
		return result;
	}

}
