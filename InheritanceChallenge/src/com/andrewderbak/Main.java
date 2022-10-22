package com.andrewderbak;

public class Main {

	
    public static void main(String[] args) {
		
    	// Challenge
    	// Start with base class of a Vehicle, then create a Car class that inherits that.
    	// Finally, create another class, a specific type of Car that inherits from the Car class.
    	// You should be able to hand steering, changing gears, and moving (speed).
    	// You will want to decide where to put the appropriate state and behaviors.
    	// For specific car type, add something solely for that type of car
    	
    	GrandCaravan conversionVan = new GrandCaravan(60, true,"north",2, "green");
        
        System.out.println(conversionVan.toString());
        System.out.println(conversionVan.getWheels());
    
    }
	
    
    
}
