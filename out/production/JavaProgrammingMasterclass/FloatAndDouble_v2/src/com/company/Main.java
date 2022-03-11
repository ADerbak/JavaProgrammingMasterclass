package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value :" + myMinFloatValue);
        System.out.println("Float Maximum Value :" + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value :" + myMinDoubleValue);
        System.out.println("Double Maximum Value :" + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= "+ myDoubleValue);

        // Challenge - convert pounds to kilograms

        double poundsToConvert = 200d;
        double poundsToKilograms = poundsToConvert * 0.45359237d;
        System.out.println(poundsToConvert + " Pounds converts to " +  poundsToKilograms + " Kilograms");

    }
}
