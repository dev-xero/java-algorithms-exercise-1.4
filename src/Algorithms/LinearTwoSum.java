package Algorithms;

public class LinearTwoSum {
    public int[] search(int[] theArray, int target) {
        int left = 0;
        int right = theArray.length - 1;

        while (left < right) {
            int currSum = theArray[left] + theArray[right];

            if (currSum == target) { return new int[]{left, right}; }
            if (currSum > target) {
                right --;
                continue;
            }

            left ++;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        LinearTwoSum twoSum = new LinearTwoSum();
        int[] testArray = {1, 2, 3, 4, 5};
        int[] indices = twoSum.search(testArray, 10);  // returns no duplicates

        System.out.printf("[%d, %d]", indices[0], indices[1]);
    }
}
