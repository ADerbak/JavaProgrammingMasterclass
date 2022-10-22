package com.andrewderbak;

public class HealthyBurger extends Hamburger {

	private String healthyExtra1Name;
	private double healthyExtra1Price;
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	
	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, price, "Brown rye");
		// TODO Auto-generated constructor stub
	}
	
	public void addHealthyAddition1(String name,double addition1) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = addition1;
		System.out.println("Added "+ name +" for an extra " + addition1);
		
	}
	
	public void addHealthyAddition2(String name, double addition2) {
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = addition2;
		System.out.println("Added "+ name +" for an extra " + addition2);
		
	}

	@Override
	public double itemizeHamburger() {
		// TODO Auto-generated method stub
		double price = super.itemizeHamburger();
		price += this.healthyExtra1Price;
		price += this.healthyExtra2Price;
		return price;
	}
	
	
}
