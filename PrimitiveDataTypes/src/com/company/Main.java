package com.company;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // boolean

        // String is not a primitive type, but in fact a class
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString  );
        myString = myString + ", and this is more."; // appending to a string
        System.out.println("myString is equal to " + myString  );
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString  );

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
    }
}
