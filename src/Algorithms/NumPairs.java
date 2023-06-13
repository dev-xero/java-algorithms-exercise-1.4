package Algorithms;

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

    public static void main(String[] args) {
        int[] testArray = new int[] {1, 2, 3, 4, 1, 4};
        int pairCount = new NumPairs().count(testArray);

        System.out.println(pairCount);
    }
}
