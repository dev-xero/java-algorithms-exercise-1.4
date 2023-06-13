package Algorithms;

import Searching.BinarySearch;

import java.util.Arrays;

public class NumPairs {
    public int count(int[] theArray) {
        int cnt = 0;

        for (int i = 0; i < theArray.length; i++) {
            for (int j = i + 1; j < theArray.length; j++) {
                if (theArray[i] == theArray[j]) { cnt++; }
            }
        }

        return cnt;
    }

    public int countFast(int[] theArray) {
        Arrays.sort(theArray);
        int cnt = 0;
        BinarySearch search = new BinarySearch();

        for (int i = 0; i < theArray.length; i++) {
            int index = search.rank(theArray, theArray[i]);

            if (index > i) { cnt++; }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] testArray = new int[] {1, 2, 3, 4, 1, 4};
        int pairCount = new NumPairs().count(testArray);
        int fastPairCount = new NumPairs().countFast(testArray);

        System.out.printf("Normal - %d\n", pairCount);
        System.out.printf("Fast - %d\n", fastPairCount);
    }
}
