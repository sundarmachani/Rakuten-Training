package assign1;

public class accountDetails extends input {
	private enum TYPE {
		SAVINGS, DEMAT, CURRENT;

	}

	private enum STATUS {
		ACTIVE, INACTIVE, CLOSED;
		}
	

	private String ownerName;
	private int accountNumber;
	private String state;
	private String pincode;
	private String phone;
	private String city;
	private String flatNumber;
	private String street;
	private static int count = 175000;
	private int accountBalance=0;
	private String dateOfOpening;
	private STATUS STATUS;
	private TYPE TYPE;





	public accountDetails(String ownerName,int accountNumber,String dateOfOpening,
			String city, String state, String pincode, String phone,
			String flatNumber,String Street, 
			int accountBalance, 
			String Type, String Status) {
		this.ownerName = ownerName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.flatNumber = flatNumber;
		this.state = state;
		this.phone = phone;
		this.accountNumber = createAccountNumber();
		this.accountBalance = 1700;
		this.setDateOfOpening(dateOfOpening);
		this.TYPE = TYPE;
		this.STATUS = STATUS;
	}




	public boolean deposit(long amount) {
		input.evaluateDepositAmount(amount);

		this.accountBalance += amount;
		return true;
	}

	private int createAccountNumber() {
		return count++;
	}

	public int withdrawal(int amount) {
		input.evaluateWithdrawalAmount(accountBalance, amount);
		accountBalance -= amount;
		return amount;
	}

	public String getDetails() {
		String details = "Name : " + ownerName + "\n" + "Account Number : " + accountNumber + "\n" + "Account Type : " +TYPE
				+ "\n" + "Mobile Number :" + phone + "\n" + "Flat Number : " + flatNumber + "\n" + "Street : "+ street + "\n"
				+ "City : " + city + "\n" + "State : " + state + "\n" + "Zip Code : " + pincode + "\n";

		return details;
	}
	
	public int getBalance() {
		return accountBalance;
	}

	public STATUS getSTATUS() {
		return STATUS;
	}


	public TYPE getTYPE() {
		return TYPE;
	}


	public String getDateOfOpening() {
		return dateOfOpening;
	}


	public void setDateOfOpening(String dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
}
