package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class QuadraticThreeSum {
    public List<List<Integer>> search(int[] theArray) {
        List<List<Integer>> sums = new ArrayList<>();

        for (int i = 0; i < theArray.length - 2; i++) {
            int left = i + 1;
            int right = theArray.length - 1;

            while (left < right) {
                int currSum = theArray[left] + theArray[i] + theArray[right];

                if (currSum == 0) {
                    List<Integer> set = new ArrayList<>();
                    set.add(theArray[left]);
                    set.add(theArray[i]);
                    set.add(theArray[right]);

                    sums.add(set);
                    right--;
                    left++;
                } else if (currSum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return sums;
    }

    public static void main(String[] args) {
        int[] testArray = new int[] {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4};
        QuadraticThreeSum threeSum = new QuadraticThreeSum();
        List<List<Integer>> threePairs = threeSum.search(testArray);

        for (List<Integer> set : threePairs) {
            System.out.println(set);
        }
    }
}
