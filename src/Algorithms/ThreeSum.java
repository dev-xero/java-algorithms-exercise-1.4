package Algorithms;

// ----------------------------------------------------------------------------------------------------


import Searching.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// ----------------------------------------------------------------------------------------------------


public class ThreeSum {

    public int count = 0;


    // ----------------------------------------------------------------------------------------------------


    public List<String> computeThreeSum(int[] theArray) {
        // Returns a list of pairs containing three integers for which their sum is zero
        Arrays.sort(theArray);

        BinarySearch search = new BinarySearch();

        int size = theArray.length;
        List<String> res = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int negativeSumIndex = search.rank(theArray, -(theArray[i] + theArray[j]));

                if (negativeSumIndex > j) {
                    String indices = "(" + i + ", " + j + ", " + negativeSumIndex + ")";
                    res.add(indices);

                    count ++;
                }
            }
        }

        return res;
    }


    // ----------------------------------------------------------------------------------------------------


    public static void main(String[] args) {
        // Testing
        int[] testArray = {-1, 2, -1, 0, 4, -2, -2};
        ThreeSum threeSum = new ThreeSum();

        System.out.println(threeSum.computeThreeSum(testArray));
    }

}
