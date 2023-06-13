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


    // ----------------------------------------------------------------------------------------------------


    public static void main(String[] args) {
        // Testing
        int[] testArray = {1, 2, 3, 4, 5, 6};
        BinarySearch search = new BinarySearch();

        System.out.println(search.rank(testArray, -4));
    }

}

