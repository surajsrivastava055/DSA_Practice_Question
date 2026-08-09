package CommonCodingQuestions;
// Q #13) Given an array of integers nums and an integer target, return indices

//of the two numbers such that they add up to target.

import java.util.HashMap;

public class TwoSum_13 {

    public static int[] findTwoSum(int[] arr, int target) {

        // if array is un-sorted
        /*
         * HashMap<Integer, Integer> map = new HashMap<>();
         * for (int i = 0; i < arr.length; i++) {
         * int data = target - arr[i];
         * if (map.containsKey(data)) {
         * return new int[] { i, map.get(data) };
         * } else {
         * map.put(arr[i], i);
         * }
         * }
         * return new int[] { -1, -1 };
         */

        // if array is sorted
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] == target) {
                return new int[] { start, end };
            }
            if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 9, 11 };
        int target = 12;
        int res[] = findTwoSum(arr, target);
        for (Integer i : res) {
            System.out.println(i);
        }
    }

}
