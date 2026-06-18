package ArrayProblems;

import java.util.HashMap;

public class Solution13 {

    // Find the element which having highest frequency.
    static int[] findHighestFrequencyElement(int arr[]) {

        // Handling Empty case
        if (arr == null || arr.length == 0) {
            return new int[] { -1, 0 };
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int data : arr) {
            freq.put(data, freq.getOrDefault(data, 0) + 1);
        }

        /*
         * 1st way to iterate.
         * for (Map.Entry<Integer, Integer> i : freq.entrySet()) {
         * System.out.println(i.getKey() + "->" + i.getValue());
         * }
         */

        /*
         * 2nd way to iterate.
         * for (Integer i : freq.keySet()) {
         * System.out.println(i + "->" + freq.get(i));
         * }
         */

        // Find the element of highest frequency
        int frequency = Integer.MIN_VALUE;
        int element = -1;
        for (Integer i : freq.keySet()) {
            int value = freq.get(i);
            if (value > frequency) {
                element = i;
                frequency = value;
            }
        }
        return new int[] { element, frequency };

    }

    public static void main(String[] args) {
        int arr1[] = { 10, 54, 9, 12, 10, 10, 9, 12, 54, 10 };
        int arr[] = findHighestFrequencyElement(arr1);
        System.out.println(arr[0] + "->" + arr[1]);
    }
}