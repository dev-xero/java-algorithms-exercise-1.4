# ☕ Java Algorithms Ex-1.4
Exercise solutions for chapter 1.4 written in Java

## Algorithms Implemented
1. TwoSum, `O(N∙lg(N))`
2. LinearTwoSum, `O(N)`
3. ThreeSum, `O(N²∙lg(N))`
4. QuadraticThreeSum, `O(N²)`
5. Binary Search.rank(), `O(lg(N))`
6. Binary Search.rankClosest(), `O(lg(N))`
7. NumPairs.count(), `O(N²)`
8. NumPairs.countFast(), `O(N∙lg(N))`
9. NumPairs.countFastest(), `O(N)`
10. Pair.closest(), `O(N)`
11. Pair.farthest(), `O(N)`

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

2. BinarySearch.rankClosest:  
   To modify `BinarySearch` to find the element with the smallest index, we make an adjustment after finding a match. Instead of terminating the search, we continue searching in the left (lower indices) subarray to look for a possible earlier occurrence of the search element.
   
```java
public class BinarySearch {
    public int rankClosest(int[] theArray, int key) {
        // Returns the element with the smallest index that matches the key
        int index = -1;
        int left = 0;
        int right = theArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (theArray[mid] == key) {
                index = mid;
                right = mid - 1;
                continue;
            }

            if (theArray[mid] > key) {
                right = mid - 1;
                continue;
            }

            left = mid + 1;
        }

        return index;
    }
}
```
