package com.company;

public class Main {

    public static void main(String[] args) {
        // New method put in place
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // public and static are keywords
        // "void" means don't return anything back. If we change this, it can return a value
        // anything in the braces is part of the calculateScore() method
        if (gameOver) {
            // variables can be created in code block, but cannot be accessed outside of code block
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1; // return -1 if gameOver is not true.
    }
}
