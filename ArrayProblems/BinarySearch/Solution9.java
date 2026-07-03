package ArrayProblems.BinarySearch;

/* Problem: Aggressive Cows
You are given an array with unique elements of stalls[], which denote the positions of stalls.
You are also given an integer k which denotes the number of aggressive cows.
The task is to assign stalls to k cows such that the minimum distance between any two of them is
the maximum possible. */
// GFG Link: https://www.geeksforgeeks.org/problems/aggressive-cows/1

import java.util.Arrays;

public class Solution9 {

    public static boolean isValid(int mid, int[] arr, int k) {

        int cow = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - cow >= mid) {
                count++;
                if (count == k) {
                    return true;
                }
                cow = arr[i];
            }
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);

        int start = 1;
        int end = stalls[stalls.length - 1] - stalls[0];
        int ans = -1;

        if (stalls.length < k) {
            return ans;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(mid, stalls, k)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8, 9 };
        int k = 3;
        System.out.println(aggressiveCows(arr, k));
    }

}
