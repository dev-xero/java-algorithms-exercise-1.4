package Algorithms;

public class LocalMinimum {
    // Returns an index, i such that a[i-1] < a[i] < a[i+1]
    public int find(int[] theArray) {
        int low = 0;
        int high = theArray.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (theArray[mid] < theArray[mid-1] && theArray[mid+1] > theArray[mid]) {
                return mid;
            } else if (theArray[mid-1] < theArray[mid+1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] testArray = new int[] {1, 2, 0, 7, 5, 1, 4};
        int localMinimum = new LocalMinimum().find(testArray);

        System.out.println(localMinimum);
    }
}
