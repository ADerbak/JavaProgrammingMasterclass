package com.company;

public class Main {

    public static void main(String[] args) {
        // New method put in place

        int highscore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highscore);

        highscore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highscore);

        displayHighScore("Andrew", calculateHighScore(1500));
        displayHighScore("Becca", calculateHighScore(900));
        displayHighScore("Cathy", calculateHighScore(400));
        displayHighScore("Doug", calculateHighScore(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // public and static are keywords
        // "void" means don't return anything back. If we change this, it can return a value
        // anything in the braces is part of the calculateScore() method
        if (gameOver) {
            // variables can be created in code block, but cannot be accessed outside of code block
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1; // return -1 if gameOver is not true.
    }

    public static void displayHighScore(String playerName, int position) {

        System.out.println(playerName +
                " managed to get into position " +
                position +
                " on the high score table");
    }

    public static int calculateHighScore(int score) {
        if (score >= 1000){
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
