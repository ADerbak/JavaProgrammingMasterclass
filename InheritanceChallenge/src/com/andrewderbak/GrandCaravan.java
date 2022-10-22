package com.andrewderbak;

public class GrandCaravan extends Car {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public GrandCaravan(int speed, boolean moving, String direction, int gear, String color) {
		super(speed, moving, direction, gear, 4, 4);
		this.color = color;
	}
	
	
	
	
}
