package Testing;

import Algorithms.TwoSum;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Testing
        int[] testArray = {-1, 2, 3, 1, 1, 5, 9};
        TwoSum twoSum = new TwoSum();
        List<String> res = twoSum.computeTwoSum(testArray);

        System.out.println(twoSum.count);
        for (String item : res) {
            System.out.print(item);
        }
    }
}
