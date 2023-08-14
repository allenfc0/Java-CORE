package Person;

import bankAccounts.Account;

public class Customer {
	
	private String name;
	
	// Association Type: Customer Has-A Address
	private Address address;
	
	// Association Type: Customer Has-A SavingsAccount
	private Account accountType;
	
	public Customer(String name, Address address, Account accountType) {
		this.name = name;
		this.accountType = accountType;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getAccountType() {
		return accountType;
	}

	public void setAccountType(Account accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Customer [name=" + getName() + ", address=" + getAddress() + ", accountType=" + getAccountType() + "]";
	}
	
	
	
}
