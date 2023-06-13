package Searching;

public class BinarySearch {
    public int rank(int[] theArray, int key) {
        // Implements binary search algorithm
        int lo = 0;
        int hi = theArray.length;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (theArray[mid] == key) {
                return mid;
            }

            if (theArray[mid] > key) {
                hi = mid - 1;
                continue;
            }

            if (theArray[mid] < key) {
                lo = mid + 1;
            }
        }

        return -1;
    }

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

    public static void main(String[] args) {
        // Testing
        int[] testArray = {1, 2, 3, 4, 5, 6};
        BinarySearch search = new BinarySearch();

        System.out.println(search.rank(testArray, -4));
        System.out.println(search.rankClosest(testArray, 7));
    }
}
