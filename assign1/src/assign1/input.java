package assign1;

public class input {
	public static void evaluateDepositAmount(long amount) {
		if(amount <= 0) throw new IllegalArgumentException("Amount Should Be Greater Than Zero");
	}
	public static void evaluateWithdrawalAmount(long accountBalance,int amount) {
		if(amount > accountBalance) throw new IllegalArgumentException("Amount Should Be Lesser than Or Equal To Balance Amount");
	}
}