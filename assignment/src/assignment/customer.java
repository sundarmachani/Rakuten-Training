package assignment;

public class customer {
	static int counter;
	int id;
	String address;
	String name;
	String phoneNumber;
	String email;
	public customer(int id, String address, String name, String phoneNumber, String email) {
		super();
		this.id=generateId();
		this.address = address;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		
	}
	private int generateId() {
		return counter++;
	}	
}
