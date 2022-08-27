package com.andrewderbak;


public class Main {

	public static void main(String[] args) {
		// Create a new class for bank account
		// Create fields for account number, balance, customer name, email and phone
		// number

		// Create getters and setters for each field
		// Create two additional methods
//		1. To allow the customer to deposit funds (this should increment the balance field)
//		2. To allow the customer to withdraw funds. This should deduct from the balance field,
//		but not allow the withdrawal to complete if their are insufficient funds.
//		You will want to create various code in the Main class to confirm your code is working.
//		Add some println's in the two methods above as well.

		
		BankAccount customer1 = new BankAccount();
		customer1.setAccountNumber(1);
		customer1.setBalance(10000);
		customer1.setCustomerName("Andrew");
		customer1.setPhoneNumber("123-456-7890");
		
		System.out.println("Hello" + customer1.getCustomerName()+"!");
		
		customer1.deposit(500);
		customer1.withdrawal(100000);
		customer1.withdrawal(1000);
	
	
	
	// Create a new class VIPCustomer
	// It should have 3 fields - name, credit limit, and email address
	// create 3 constructors
	// 1st constructor - empty, should call the constructor with default values
	// 2nd constructor - should have 2 values it receives and default for 3rd
	// 3rd constructor - save all fields
	// create getters only for this
	// test and confirm it works
	
	
		VIPCustomer vipA = new VIPCustomer();
		VIPCustomer vipB = new VIPCustomer("Andrew",250000,"this@email.com");
		VIPCustomer vipC = new VIPCustomer("Douglas",5000);
		
		VIPCustomer[] vips = new VIPCustomer[3];
		vips[0] = vipA;
		vips[1] = vipB;
		vips[2] = vipC;
		
		for (VIPCustomer cust : vips) {
			System.out.println(cust.getName() +";"+ cust.getCreditLimit() + ";"+cust.getEmailAddress());
		}
	}
	
}
