package com.company;

public class Main {

    public static void main(String[] args) {

        // Addition and Subtraction
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;  // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        // Multiplication
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // Division
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // Modulo
        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = "+ result);

        // Abbreviating Operators

        // result = result +1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result  = result / 3
        result /= 3;  // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) { // Using curly braces allows you to do multi-line
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        // if - then code block:

        // if (expression) {
            // expression
        // }

        // Other boolean operators: ==, !=, >, <, >=, <=
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        // Add multiple conditions: && and ||
        // WARNING: "&" or "|" are bitwise operators and will work differently!
        // Always use && or || for logical operators; bitwise operators are more advanced

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) { // tested the differences between = and ==
            System.out.println("This is not an error");
        }

        boolean isCar = false;
        if (isCar = true) { // assigning a boolean in the IF statement will update the assignment
            System.out.println("This is not supposed to happen");
        }

        if (isCar) { // We can simplify by removing == test
            System.out.println("This is a simple test");
        }

        // Using ternary operands

        boolean wasCar = isCar ? true : false; // If first condition is true
        // So, (isCar == True)?; If true, then wasCar is true, otherwise false.
        // This is a shortcut for IF-THEN-ELSE
        if (wasCar){
            System.out.println("wasCar is true");
        }
    }
}
