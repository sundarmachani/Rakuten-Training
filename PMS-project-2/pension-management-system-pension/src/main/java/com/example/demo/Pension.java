package com.example.demo;

public class Pension {
	private float pensionAmount;
	private int bankServiceCharge;

	public Pension(float pensionAmount, int bankServiceCharge) {
		super();
		this.pensionAmount = pensionAmount;
		this.bankServiceCharge = bankServiceCharge;
	}

	public int getBankServiceCharge() {
		return bankServiceCharge;
	}

	public void setBankServiceCharge(int bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}

	public float getPensionAmount() {
		return pensionAmount;
	}

	public void setPensionAmount(float pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

}
