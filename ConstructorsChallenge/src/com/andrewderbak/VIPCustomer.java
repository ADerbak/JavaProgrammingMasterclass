package com.andrewderbak;

public class VIPCustomer {

	private String name;
	private int creditLimit;
	private String emailAddress;
	
	
	public String getName() {
		return name;
	}



	public int getCreditLimit() {
		return creditLimit;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public VIPCustomer(String name, int creditLimit, String emailAddress) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}



	public VIPCustomer(String name, int creditLimit) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = "unknown email";
	}




	public VIPCustomer() {
		this("Unknown", 10000, "unknown email");
	}
	
	
	
}
