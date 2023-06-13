# ☕ Java Algorithms Ex-1.4
Exercise solutions for chapter 1.4 written in Java

## Algorithms Implemented
1. TwoSum, `O(Nlg(N))`
2. LinearTwoSum, `O(N)`
3. ThreeSum, `O(N^2lg(N))`
4. Binary Search, `O(lg(N))`
5. NumPairs.count(), `O(N^2)`

## Code Examples
1. LinearTwoSum:  
We can implement `TwoSum` using a linear approach by utilizing two pointers positioned at the left and right ends of the sorted array. This algorithm is optimized for performance when the array is already sorted. In case the target sum cannot be obtained from the array, the algorithm returns an array with indices set to -1.
```java
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
}
```
