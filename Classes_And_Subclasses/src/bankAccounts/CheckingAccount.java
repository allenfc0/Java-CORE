package bankAccounts;


/*
 * @author(Allen Farias Chavez)
 * @version(8/5/23)
 * @description(Checking account can only be used to add and remove money without any interest. Also, money here does
 * not grow)
 */
// Association Type: CheckingAccount IS-A Account 
public class CheckingAccount extends Account {
	
	
	public CheckingAccount(Double accountAmount) {
		super(accountAmount);
		
	}
	
	/*
	 * If the CheckingAccount accountAmount has less than $150 at the end of the month remove $10
	 */
	protected void accountPenaltyFee() {
		if(super.getAccountAmount() < 150) {
			super.subtractAccountAmount(10D);
			System.out.printf("Account Amount: %d. We subtracted $10 from your account\n", super.getAccountAmount());
		}
		
		System.out.println("No Amount was subtracted from your account. Thank you!");
	}	
	
	// Run-Time Polymorphism
	@Override
	public String toString() {
		return "CheckingAccount [getAccountNumber()="
				+ super.getAccountNumber() + ", getAccountAmount()=" + super.getAccountAmount() + "]";
	}

	
	
	
	
	
	
}
