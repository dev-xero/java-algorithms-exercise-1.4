package Algorithms;

// ----------------------------------------------------------------------------------------------------


import Searching.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// ----------------------------------------------------------------------------------------------------


public class TwoSum {

    public int count = 0;


    // ----------------------------------------------------------------------------------------------------


    public List<String> computeTwoSum(int[] theArray) {
        // Returns a list of pairs for which each pair sums to zero
        Arrays.sort(theArray);

        List<String> res = new ArrayList<>();
        BinarySearch search = new BinarySearch();

        int i = 0;

        for (int item : theArray) {
            int negativeNumIndex = search.rank(theArray, -item);

            if (negativeNumIndex > i) {
                String indices = "(" + i + ", " + negativeNumIndex + ")";
                res.add(indices);

                count++;
            }

            i++;
        }

        return res;
    }


    // ----------------------------------------------------------------------------------------------------


    public static void main(String[] args) {
        //Testing
        int[] testArray = {1, 3, 4, -2, 1, -1, -4, 0, 0};
        TwoSum twoSum = new TwoSum();

        System.out.println(twoSum.computeTwoSum(testArray));
    }

}
