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
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);


        long myLongValue = 100L; // must have L at the end of the number, otherwise will be treated as INT
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        // Need to cast to using (byte) since it treats it as an int when dividing by 2
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        // Primitive Types Challenge
        // Create variables of byte, short, and int types
        // Create a long and make = 50000 + (10 * sum(int+byte+short values))

        byte challengeByte = 10;
        short challengeShort = 20;
        int challengeInt = 50;

        long challengeLong = 50000L + (10L *
                (challengeInt + challengeByte + challengeShort));

        System.out.println(challengeLong);


    }
}
