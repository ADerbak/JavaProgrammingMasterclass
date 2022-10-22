package com.andrewderbak;

public class Hamburger {

	private String name;
	private String meat;
	private double price;
	private String breadRollType;
	
	public Hamburger(String name, String meat, double price, String breadRollType) {
		super();
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
		System.out.println(name + " hamburger on a "+breadRollType+" roll with "+ meat+", price is "+price);
	}
	
	private String addition1Name;
	private double addition1Price;
	private String addition2Name;
	private double addition2Price;
	private String addition3Name;
	private double addition3Price;
	private String addition4Name;
	private double addition4Price;
	
	public void addHamburgerAddition1(String name,double addition1) {
		this.addition1Name = name;
		this.addition1Price = addition1;
		System.out.println("Added "+ name +" for an extra " + addition1);
		this.price += addition1;
	}
	
	public void addHamburgerAddition2(String name, double addition2) {
		this.addition2Name = name;
		this.addition2Price = addition2;
		System.out.println("Added "+ name +" for an extra " + addition2);
		this.price += addition2;
	}
	
	public void addHamburgerAddition3(String name, double addition3) {
		this.addition3Name = name;
		this.addition3Price = addition3;
		System.out.println("Added "+ name +" for an extra " + addition3);
		this.price += addition3;
	}
	
	public void addHamburgerAddition4(String name, double addition4) {
		this.addition4Name = name;
		this.addition4Price = addition4;
		System.out.println("Added "+ name +" for an extra " + addition4);
		this.price += addition4;
	}
	
	public double itemizeHamburger() {
		double price = (double) Math.round(this.price*100.0)/100.0;
		return price;
	}
}
