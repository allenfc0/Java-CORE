package bankAccounts;

import java.util.Random;

public class Account {

	// Encapsulation
	//private String accountHolderName;
	private Integer accountNumber;
	private Double accountAmount;
	
	// just to check how static works. 
	// I will allow this to be changed. I know usually it's access is supposed to be private
	protected static String phrase= "Account was created";
	
	public Account(Integer accountAmount) {
		Random random = new Random();
		
		// accounNumber will be an 8 digit number but below 9 digits
		this.accountNumber = random.nextInt(1000_0000_0) + 1000_0000;
		
		this.accountAmount = Double.valueOf(accountAmount);
		//sayHi();
	}
	
	public Account(Double accountAmount) {
		//this.accountHolderName = accountHolderName;
		Random random = new Random();
		
		// accounNumber will be an 8 digit number but below 9 digits
		this.accountNumber = random.nextInt(1000_0000_0) + 1000_0000;
		
		this.accountAmount = accountAmount;
	}
	
	public Integer getAccountNumber() {
		return this.accountNumber;
	}
	
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Double getAccountAmount() {
		return this.accountAmount;
	}
	
	
	/*
	 * Compile-Time Polymorphism-----------------------------------
	 */
	public void addAccountAmount(Integer amount) {
		this.accountAmount += amount;
	}
	
	public void addAccountAmount(Double amount) {
		this.accountAmount += amount;
	}
	
	public void subtractAccountAmount(Integer amount) {
		this.accountAmount -= amount;
	}
	
	public void subtractAccountAmount(Double amount) {
		this.accountAmount -= amount;
	}

	/*
	 * -------------------------------------------------------------
	 */
	
	// Run-Time Polymorphism
	@Override
	public String toString() {
		return "Account [accountNumber=" + getAccountNumber()
				+ ", accountAmount=" + getAccountAmount() + "]";
	}
	
	// -------------------------------------------------------------
	
	/*
	 * Give amount to everyone
	 */
	protected static void sayHi() {
		System.out.println(phrase);
	}
	
	
	
}

















