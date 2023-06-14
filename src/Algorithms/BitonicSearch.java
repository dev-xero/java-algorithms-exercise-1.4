package Algorithms;

public class BitonicSearch {
    public boolean isBitonic(int[] theArray) {
        // Returns true if an array is bitonic, false otherwise
        int low = 0;
        int high = theArray.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (theArray[mid] < theArray[mid+1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low != 0 && low != theArray.length - 1;
    }

    public static void main(String[] args) {
        // Testing
        int[] testArray = new int[] {1, 3, 6, 9, 12, 10, 7, 4, 2};
        BitonicSearch bitonic = new BitonicSearch();

        System.out.println(bitonic.isBitonic(testArray));
    }
}
