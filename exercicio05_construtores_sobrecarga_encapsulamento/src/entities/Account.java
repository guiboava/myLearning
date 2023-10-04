package entities;

public class Account {
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	
	public Account() {
		
	}
	
	public Account(int accountNumber, String accountName, double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		accountDeposit(initialBalance);
	}

	public Account(int accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void accountDeposit(double depositValue) {
		accountBalance += depositValue;
	}
	public void accountWithdraw(double withdrawValue) {
		accountBalance -= withdrawValue + 5.0f;
	}
	public String toString() {
		return "Account " +
				accountNumber +
				", Holder: " +
				accountName +
				", Balance: $ " +
				String.format("%.2f", accountBalance);
	}
}
