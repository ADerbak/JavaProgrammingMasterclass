package com.company;

public class Main {

    public static void main(String[] args) {
	    // a mile is equal to 1.609344 kilometres
        double kilometres = (100 * 1.609344);
        int highscore = 50;

        if(highscore == 50) {
            System.out.println("This is an expression!");

        }
        // Label the expressions -- commenting out for future work
        //int score = 100; // Expression
        //if (score > 99) { // If is an Expression; score > 99 is an expression
        //    System.out.println("You got a highscore!"); // Method with an Expression
        //    score = 0; // Expression
        //}

        int myVariable = 50; // The entire line is a Statement
        myVariable++;
        myVariable--;
        System.out.println("This is a test"); // Method with a statement

        System.out.println("This is another" +
                " statement" +
                " and another statement."); // this is all one statement

        // a ";" is a terminator B`]

        int anotherVariable = 5; myVariable--; // This is as valid as two lines, but can be confusing

        // line spacing (not between "") doesn't matter, same with any white space.
        // Java is just reading line by line and ignoring whitespace.
        // All indentations are just for coding readability.



        // Code Blocks and the IF-THEN-ELSE control statements

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000 && score > 10) {
//            System.out.println("Your score was less than 1000");
//
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            // variables can be created in code block, but cannot be accessed outside of code block
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);


            // Challenge 2:
            // Print out a second score on the screen with the following
            // score set to 10000
            // levelCompleted set to 8
            // bonus set to 200
            // But make sure the first printout above still displays as well

            score = 10000;
            levelCompleted = 8;
            bonus = 200;

            finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }



    }
}
