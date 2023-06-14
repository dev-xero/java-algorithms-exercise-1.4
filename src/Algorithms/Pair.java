package Algorithms;

import java.util.Arrays;

public class Pair {
    public double[] closest(double[] theArray) {
        // Returns a pair of adjacent ints whose absolute difference is no larger than any other pair
        Arrays.sort(theArray);

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

    public static void main(String[] args) {
        // Testing
        double[] testArray = new double[] {1.0, 2.0, 3.3, 6.0, 8.0, 11.0};
        Pair pair = new Pair();

        double[] theClosestPair = pair.closest(testArray);
        System.out.printf("[%f, %f]", theClosestPair[0], theClosestPair[1]);
    }
}
