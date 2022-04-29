package com.example.demo;

import com.example.demo.PensionerDetails.ACCOUNTTYPE;
import com.example.demo.PensionerDetails.PENSIONTYPE;

public class PensionService {
	Pension pensionCalculator(PensionerDetails pensionerDetails) {
		float pensionAmount = 0;
		if (pensionerDetails.getPensiontype().equals(PENSIONTYPE.SELF)) {
			pensionAmount = (float) (pensionerDetails.getSalaryEarned() * 0.8 + pensionerDetails.getAllowances());
		} else {
			pensionAmount = (float) (pensionerDetails.getSalaryEarned() * 0.5 + pensionerDetails.getAllowances());
		}

		int bankServiceCharge = 0;
		if (pensionerDetails.getAccounttype().equals(ACCOUNTTYPE.PUBLIC)) {
			bankServiceCharge = 500;
		} else {
			bankServiceCharge = 550;
		}

		Pension pension = new Pension(pensionAmount, bankServiceCharge);
		return pension;
	}

}
