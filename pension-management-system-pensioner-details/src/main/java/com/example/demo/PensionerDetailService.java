package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.PensionerDetails.ACCOUNTTYPE;
import com.example.demo.PensionerDetails.PENSIONTYPE;

@Service
public class PensionerDetailService {
	List<PensionerDetails> pensionerDetails = new ArrayList<>();
	PensionerDetailService() {
		pensionerDetails.add(new PensionerDetails("John","12-12-1990","ABC123B","77766612345",4500000d,7000d,PENSIONTYPE.SELF,"ING","1234567",ACCOUNTTYPE.PRIVATE));
		pensionerDetails.add(new PensionerDetails("Feddy","05-09-1995","DCC143F","348754359434",50000000d,65000d,PENSIONTYPE.SELF,"RED","34875359",ACCOUNTTYPE.PUBLIC));
		pensionerDetails.add(new PensionerDetails("Jonathan","17-10-1997","FGH238S","27986532491",5500000d,70000d,PENSIONTYPE.FAMILY,"GOV","FG2398574",ACCOUNTTYPE.PUBLIC));
		pensionerDetails.add(new PensionerDetails("Xin chan","20-11-1980","SDJB1212S","37586834895",74600000d,75000d,PENSIONTYPE.FAMILY,"ING","1234567",ACCOUNTTYPE.PRIVATE));

	}
	
	 PensionerDetails getPensionerDetails(String aadharNumber) {
		List<PensionerDetails> pensionerDetail = pensionerDetails.stream().filter(pensiondetails -> pensiondetails.getAadhar().equals(aadharNumber)).collect(Collectors.toList());
		if(pensionerDetail.size() == 0) {
			return new PensionerDetails(false);
		}
		System.out.println(pensionerDetail.get(0));
		return pensionerDetail.get(0);
	}
}
