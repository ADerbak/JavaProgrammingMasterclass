package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        // if we try to put a value too large, it will "overflow" into a negative (or vice-versa)
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // This is called underflow

        // We can use _ in place of commas
        // int myMaxIntTest = 2_147_483_648; // This will give an error as it is too large for INT

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinByteValue);
        System.out.println("Integer Maximum Value = " + myMaxByteValue);

    }
}
