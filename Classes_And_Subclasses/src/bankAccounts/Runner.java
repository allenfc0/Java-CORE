package bankAccounts;

import Person.Address;
import Person.Customer;

public class Runner {
	public static void main(String[] args) {
		
		//Abstraction
		Account checking = new CheckingAccount(100.0);
		//Account saving = new SavingsAccount(1000D, "Savings Account", 5000D);
		
		Address customerAddress = new Address("931 N Orange", "Mesa", "Arizona", 85201);
		
		Customer customer1 = new Customer("Allen", customerAddress, checking);
		
		//saving.setGoalType(GoalType.CAR_SAVINGS);
		//CheckingAccount.sayHI();
		//CheckingAccount.phrase = "Space empty";
		//CheckingAccount.sayHI();
		
		//System.out.println(checking.toString());
		//System.out.println(saving.toString());
		System.out.println(customer1);
	}
}
