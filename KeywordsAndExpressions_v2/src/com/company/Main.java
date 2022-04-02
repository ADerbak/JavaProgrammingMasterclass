package com.company;

public class Main {

    public static void main(String[] args) {

        // Code Blocks and the IF-THEN-ELSE control statements
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        // New method put in place
        calculateScore(true, 800, 5, 100);

        // Moved to a new method
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;

        calculateScore(true, 10000, 8, 200);
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // public and static are keywords

        // anything in the braces is part of the calculateScore() method
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            // variables can be created in code block, but cannot be accessed outside of code block
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }
}
