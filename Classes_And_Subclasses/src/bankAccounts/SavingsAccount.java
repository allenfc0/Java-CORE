package bankAccounts;

/*
 * @author(Allen Farias Chavez)
 * @version(8/5/23)
 * @description(Savings account can only be used to add and remove money with interest if amount removed is greater than $500.
 * Also, money here does grow)
 */
//Association Type: CheckingAccount IS-A Account
public class SavingsAccount extends Account{

	private String goalName;
	private GoalType goalType;
	private Double goalAmount;
	
	public SavingsAccount(Double accountAmount, String goalName, Double goalAmount) {
		super(accountAmount);
		
		this.goalName = goalName;
		this.goalType = GoalType.EMERGENCY_SAVINGS;
		this.goalAmount = goalAmount;
	}
	
	
	public String getGoalname() {
		return this.goalName;
	}
	
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	
	public String getGoalType() {
		return this.goalType.toString();
	}
	
	public void setGoalType(GoalType goalType) {
		this.goalType = goalType;
	}
	
	public Double getGoalAmount() {
		return this.goalAmount;
	}
	
	public void setGoalAmount(Double goalAmount) {
		this.goalAmount = goalAmount;
	}
	
	
	
	/*
	 * In a SavingsAccount, the amount limit that can be subtracted is greater than $500. 
	 * If more is subtracted, then a fee of $10 will take place.
	 */
	@Override
	public void subtractAccountAmount(Double amount) {
		if(amount > 500) {
			super.subtractAccountAmount(amount - 10);
		}
		
		System.out.println("A fee of $10 has been placed for subtracting more than $500");
	}


	@Override
	public String toString() {
		return "SavingsAccount [goalName=" + goalName + ", goalType=" + goalType + ", goalAmount=" + goalAmount
				+ ", getAccountNumber()=" + super.getAccountNumber()
				+ ", getAccountAmount()=" + super.getAccountAmount() + "]";
	}


	
	
	
	
	
}









