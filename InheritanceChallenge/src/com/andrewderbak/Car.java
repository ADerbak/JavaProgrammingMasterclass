package com.andrewderbak;

public class Car extends Vehicle {

	private int gear;
	private int wheels;
	private int doors;
	

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	
	private boolean steering;

	public boolean isSteering() {
		return steering;
	}

	public void setSteering(boolean steering) {
		this.steering = steering;
	}
	
	
	public Car(int speed, boolean moving, String direction, int gear, int doors, int wheels) {
		super(speed, direction, moving);
		this.gear = gear;
		this.doors = doors;
		this.wheels = wheels;
	}
	
	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void shiftGear(int gear) {
		
		int gearShift = this.gear + gear;
		
		if (gearShift >0 & gearShift < 6) {
		
			this.gear = gearShift;
		}
	
	}

}
