package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class CubicFourSum {
    public List<List<Integer>> search(int[] theArray) {
        // Returns a list of four ints that sum to zero in the argument array
        List<List<Integer>> sums = new ArrayList<>();

        for (int i = 0; i < theArray.length - 3; i++) {
            for (int j = i + 1; j < theArray.length - 2; j++) {
                int left = 0;
                int right = theArray.length - 1;

                while (left < right) {
                    int currSum = theArray[i] + theArray[j] + theArray[left] + theArray[right];

                    if (currSum == 0) {
                        List<Integer> set = new ArrayList<>();

                        set.add(theArray[i]);
                        set.add(theArray[j]);
                        set.add(theArray[left]);
                        set.add(theArray[right]);

                        sums.add(set);

                        left++;
                        right--;
                    } else if (currSum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return sums;
    }

    public static void main(String[] args) {
        int[] testArray = new int[] {-3, -2, -1, 1, 2, 3};
        CubicFourSum fourSum = new CubicFourSum();

        List<List<Integer>> zeroSums = fourSum.search(testArray);

        for (List<Integer> set : zeroSums) {
            System.out.println(set);
        }
    }
}
