package Algorithms;

import java.util.Arrays;

public class Pair {
    public double[] closest(double[] theArray) {
        // Returns a pair of adjacent doubles whose absolute difference is no larger than any other pair
        double minDiff = Integer.MAX_VALUE;
        double[] pair = new double[] {theArray[0], theArray[1]};

        for (int i = 1; i < theArray.length; i++) {
            double prev = theArray[i-1];
            double currDiff = Math.abs(theArray[i] - prev);

            if (currDiff < minDiff) {
                minDiff = currDiff;
                pair = new double[] {prev, theArray[i]};
            }
        }

        return pair;
    }

    public double[] farthest(double[] theArray) {
        // Returns a pair of adjacent doubles whose absolute difference is no smaller than any other pair
        double maxDiff = Integer.MIN_VALUE;
        double[] pair = new double[] {theArray[0], theArray[1]};

        for (int i = 1; i < theArray.length; i++) {
            double curr = theArray[i];
            double prev = theArray[i-1];
            double currDiff = Math.abs(curr - prev);

            if (currDiff > maxDiff) {
                maxDiff = currDiff;
                pair = new double[] {prev, curr};
            }
        }

        return pair;
    }

    public static void main(String[] args) {
        // Testing
        double[] testArray = new double[] {1.0, 2.0, 3.3, 6.0, 8.0, 11.0};
        Pair pair = new Pair();

        double[] theClosestPair = pair.closest(testArray);
        double[] theFarthestPair = pair.farthest(testArray);

        System.out.printf("Closest Pair - [%f, %f]\n", theClosestPair[0], theClosestPair[1]);
        System.out.printf("Farthest Pair - [%f, %f]\n", theFarthestPair[0], theFarthestPair[1]);
    }
}
