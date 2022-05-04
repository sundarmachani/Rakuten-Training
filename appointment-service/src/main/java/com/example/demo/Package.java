package com.example.demo;

public class Package {
	private enum SUBCRIPTION {
		SINGLE, FOURSESSION, FIVESESSION;
	}
	private int planDuratinInWeeks;
	private float membershipPrice;
	private SUBCRIPTION subcription;
	
	public void planDetails() {
		if(SUBCRIPTION.SINGLE != null) {
			System.out.println("plan price is 500/-");
		}
		if(SUBCRIPTION.FOURSESSION != null) {
			System.out.println("plan price is 400/-");
		} else {
			System.out.println("plan price is 300/-");
		}
			
	}
	public int getPlanDuratinInWeeks() {
		return planDuratinInWeeks;
	}
	public void setPlanDuratinInWeeks(int planDuratinInWeeks) {
		this.planDuratinInWeeks = planDuratinInWeeks;
	}
	public float getMembershipPrice() {
		return membershipPrice;
	}
	public void setMembershipPrice(float membershipPrice) {
		this.membershipPrice = membershipPrice;
	}
	
	public SUBCRIPTION getSubcription() {
		return subcription;
	}
	public void setSubcription(SUBCRIPTION subcription) {
		this.subcription = subcription;
	}
}
