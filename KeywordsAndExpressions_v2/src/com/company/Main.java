package com.company;

public class Main {

    public static void main(String[] args) {
        // New method put in place

        int highscore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highscore);

        highscore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highscore);

        String player1 = displayHighScore("Andrew", calculateHighScore(1500));
        System.out.println(player1);
        String player2 = displayHighScore("Becca", calculateHighScore(900));
        System.out.println(player2);
        String player3 = displayHighScore("Cathy", calculateHighScore(400));
        System.out.println(player3);
        String player4 = displayHighScore("Doug", calculateHighScore(50));
        System.out.println(player4);
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

    public static String displayHighScore(String playerName, int position) {

        String message =  playerName +
                " managed to get into position " +
                position +
                " on the high score table";
        return message;
    }

    public static int calculateHighScore(int score) {
        int position = 4;
        if (score > 1000){
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
