package com.andrewderbak;

public abstract class Vehicle {

	private int speed;
	private String direction;
	private boolean moving;
	
	public boolean isMoving() {
		return moving;
	}
	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Vehicle(int speed, String direction, boolean moving) {
		this.speed = speed;
		this.direction = direction;
		this.moving = moving;
	}
	@Override
	public String toString() {
		return "Vehicle \n speed=" 
				+ speed 
				+ ",\n direction=" 
				+ direction 
				+ ",\n moving=" 
				+ moving 
				+ ",\n getSpeed()="
				+ getSpeed() 
				+ ",\n getDirection()=" 
				+ getDirection() + ";";
	}
	
	
	
}
