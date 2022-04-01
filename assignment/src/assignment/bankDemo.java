package assignment;

import java.util.ArrayList;

public class bankDemo {
	public static void main(String[] args) {

		ArrayList<customer> customers = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			String name = "rakuten"+i+"ian";
			String address = "Address"+i*100;
			String email = "rakuten+ "+i+" +@gamil.com";
			String phoneNo = "8689989898"+i;
			
			customer cus = new customer(i, name , address , email, phoneNo);
			customers.add(cus);
		}
		
		customers.forEach((cus) ->
		  System.out.println(cus)
				);
		
		
	}


}

