package com.ronnytech;

public class DartsGame {

    //function to calculate and returns correct amount earned by dart landing
    public static int calculateScore(double x, double y) {

        double distance = Math.sqrt(x * x + y * y); // pythagoras theorem to get the distance of the dart to the center of target.

        // if else statement to award points in regard to position of the dart.
        if (distance > 10) {
            return 0;
        } else if (distance > 5) {
            return 1;
        } else if (distance > 1) {
            return 5;
        } else {
            return 10;
        }
    }

    // sample usage in main method.
    public static void main(String[] args) {
        int score = calculateScore(0, 10); // the dart landed at coordinates (0, 10)
        System.out.println("For the given coordinates, the score is " + score); // output
    }
}