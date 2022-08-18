package com.andrewderbak;

public class BankAccount {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void deposit(int amount) {
		System.out.println("Balance before deposit: " + this.balance);
		this.balance += amount;
		System.out.println("Deposit = "+ amount +" New balance: " + this.balance);
	}
	
	public void withdrawal(int amount) {
		
		if (amount > this.balance) {
			System.out.println("Sorry, you do not have enough in your account");
		} else {
		System.out.println("Balance before withdrawal: " + this.balance);
		this.balance -= amount;
		System.out.println("Withdrawal = "+ amount +" New balance: " + this.balance);
	}
	}
	
	
	
	
	
}
