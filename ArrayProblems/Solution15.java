package ArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class Solution15 {

    // Problem: count the frequency of each element in array

    static void findHighestFrequencyElement(int arr[]) {

        // Handling Empty case
        if (arr == null || arr.length == 0) {
            System.out.println("Array is Empty");
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int data : arr) {
            freq.put(data, freq.getOrDefault(data, 0) + 1);
        }

        // 1st way to iterate.
        for (Map.Entry<Integer, Integer> i : freq.entrySet()) {
            System.out.println(i.getKey() + "->" + i.getValue());
        }

        /*
         * 2nd way to iterate.
         * for (Integer i : freq.keySet()) {
         * System.out.println(i + "->" + freq.get(i));
         * }
         */
    }

    public static void main(String[] args) {
        int arr1[] = { 10, 54, 9, 12, 10, 10, 9, 12, 54, 10 };
        findHighestFrequencyElement(arr1);

    }
}