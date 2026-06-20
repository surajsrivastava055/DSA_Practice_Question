package ArrayProblems;

import java.util.*;

public class Solution25 {

    static List<Integer> findMissingNumber(int arr[]) {

        // 1st way.
        /*
         * List<Integer> data = new ArrayList<>();
         * int n = arr.length;
         * 
         * // Marking the element which is avalaible
         * for (int i = 0; i < n; i++) {
         * int num = Math.abs(arr[i]);
         * if (arr[num - 1] > 0) {
         * arr[num - 1] = -(arr[num - 1]);
         * }
         * }
         * 
         * // returing missing element
         * for (int i = 0; i < n; i++) {
         * if (arr[i] > 0) {
         * data.add(i + 1);
         * }
         * }
         * return data;
         */

        // 2nd way not best
        int count = 0;
        List<Integer> data = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(count)) {
                data.add(count);
            }
            count++;
        }

        return data;

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 7, 2, 3, 4, 5, 5, 3, 2, 2, 4 };

        System.out.println(findMissingNumber(arr));

    }

}
