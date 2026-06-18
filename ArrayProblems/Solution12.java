package ArrayProblems;

import java.util.HashMap;

public class Solution12 {

    // Find the element which having highest frequency and lowest frequency.
    static int[] findHighestFrequencyElement(int arr[]) {

        // Handling Empty case
        if (arr == null || arr.length == 0) {
            return new int[] { -1, -1 };
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
        int frequencyHigh = Integer.MIN_VALUE;
        int element = -1;
        for (Integer i : freq.keySet()) {
            int value = freq.get(i);
            if (value > frequencyHigh) {
                element = i;
                frequencyHigh = value;
            }
        }

        int frequencyLow = Integer.MAX_VALUE;
        int element1 = -1;
        for (Integer i : freq.keySet()) {
            int value = freq.get(i);
            if (value < frequencyLow) {
                element1 = i;
                frequencyLow = value;
            }
        }
        return new int[] { element, element1 };

    }

    public static void main(String[] args) {
        int arr1[] = { 10, 54, 9, 12, 10, 10, 9, 12, 54, 10 };
        int arr[] = findHighestFrequencyElement(arr1);
        System.out.println("Highest Frequency of the element: " + arr[0]);
        System.out.println("Lowest Frequency of the element: " + arr[1]);
    }
}