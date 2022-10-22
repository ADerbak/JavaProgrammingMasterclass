package com.andrewderbak;

public class DeluxeBurger extends Hamburger{

	public DeluxeBurger() {
		super("Deluxe", "Sausage & Bacon", 14.54, "White");
//		this.addHamburgerAddition1("Chips", 2.75);
//		this.addHamburgerAddition2("Drink", 1.81);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addHamburgerAddition3(String name, double addition3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addHamburgerAddition1(String name, double addition1) {
		// TODO Auto-generated method stub
		super.addHamburgerAddition1("Chips", 2.75);
	}

	@Override
	public void addHamburgerAddition2(String name, double addition2) {
		// TODO Auto-generated method stub
		super.addHamburgerAddition2("Drink", 1.81);
	}

	@Override
	public void addHamburgerAddition4(String name, double addition4) {
		// TODO Auto-generated method stub
	}

	
	
}
