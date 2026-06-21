package ArrayProblems;

import java.util.HashMap;

// Find the First Repitive Element in the array
public class Solution23 {

    static void findFirstRepetiveElement(int arr[]) {
        HashMap<Integer, Integer> data = new HashMap<>();
        for (int i : arr) {
            data.put(i, data.getOrDefault(i, 0) + 1);
        }

        //
        for (Integer i : data.keySet()) {
            if (data.get(i) > 1) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 10, 15, 5, 6, 6, 7, 5, 8, 9, 9 };

        findFirstRepetiveElement(arr);
    }

}
