package com.example.demo;

public class PensionerDetails {
	enum ACCOUNTTYPE {
		PUBLIC, PRIVATE;
	}

	enum PENSIONTYPE {
		SELF, FAMILY;
	}

	private boolean valid = true;

	public boolean isValid() {
		return valid;
	}

	private String pensionerName;
	private String dateOfBirth;
	private String pan;
	private String aadhar;
	private double salaryEarned;
	private double allowances;
	private PENSIONTYPE pensiontype;
	private String bankName;
	private String accountNumber;
	private ACCOUNTTYPE accounttype;

	public PensionerDetails(String pensionerName, String dateOfBirth, String pan, String aadhar, double salaryEarned,
			double allowances, PENSIONTYPE pensiontype, String bankName, String accountNumber,
			ACCOUNTTYPE accounttype) {
		super();
		this.pensionerName = pensionerName;
		this.dateOfBirth = dateOfBirth;
		this.pan = pan;
		this.aadhar = aadhar;
		this.salaryEarned = salaryEarned;
		this.allowances = allowances;
		this.pensiontype = pensiontype;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.accounttype = accounttype;

	}

	public PensionerDetails() {
		super();

	}

	public PensionerDetails(boolean valid) {
		super();
		this.valid = valid;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPensionerName() {
		return pensionerName;
	}

	public void setPensionerName(String pensionerName) {
		this.pensionerName = pensionerName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public double getSalaryEarned() {
		return salaryEarned;
	}

	public void setSalaryEarned(double salaryEarned) {
		this.salaryEarned = salaryEarned;
	}

	public double getAllowances() {
		return allowances;
	}

	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}

	public PENSIONTYPE getPensiontype() {
		return pensiontype;
	}

	public void setPensiontype(PENSIONTYPE pensiontype) {
		this.pensiontype = pensiontype;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public ACCOUNTTYPE getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(ACCOUNTTYPE accounttype) {
		this.accounttype = accounttype;
	}
	
	@Override
	public String toString() {
		return "PensionerDetail [name=" + pensionerName + ", salaryEarned=" + salaryEarned + "]";
	}


}
