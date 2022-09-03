package com.andrewderbak;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Wall wall = new Wall(5,4);
		System.out.println("area = " + wall.getArea());
		
		wall.setHeight(-1.5);
		
		System.out.println("width = " + wall.getWidth() );
		System.out.println("height = " + wall.getHeight() );
		System.out.println("area = " + wall.getArea() );
	
	
		Wall wall2 = new Wall();
		System.out.println(wall.getHeight());
	
	}

}
