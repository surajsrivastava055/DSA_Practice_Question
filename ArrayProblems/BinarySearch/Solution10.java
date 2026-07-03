package ArrayProblems.BinarySearch;

/*
Problem Statement:
You are given an array where each element represents the height of a tree.
A wood-cutting machine is used to cut all trees above a certain height H.

If a tree's height is greater than H, the part above H is collected as wood.
If a tree's height is less than or equal to H, it is not cut.

Your task is to find the maximum possible height H of the saw blade such that
at least k units of wood are collected.

Example:
Input:
arr = {20, 15, 10, 17}
k = 7

Output:
15

Explanation:
If we cut at height 15:
20 -> 5 wood
15 -> 0 wood
10 -> 0 wood
17 -> 2 wood
Total wood = 7
So the maximum valid cutting height is 15.
*/

class Solution10 {

    /*
     * Checks whether cutting all trees at height 'mid'
     * can collect at least k units of wood.
     */
    public static boolean isValid(int[] arr, int k, int mid) {
        long woodCollected = 0;

        for (int i = 0; i < arr.length; i++) {
            // Only trees taller than mid will contribute wood
            if (arr[i] > mid) {
                woodCollected += (arr[i] - mid);
            }

            // Early return if required wood is already collected
            if (woodCollected >= k) {
                return true;
            }
        }

        return false;
    }

    /*
     * Finds the maximum saw height such that
     * collected wood is at least k.
     */
    public static int findMaximumHeight(int[] arr, int k) {

        // Edge case: invalid input
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Find maximum tree height to define binary search range
        int maxHeight = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxHeight) {
                maxHeight = arr[i];
            }
        }

        int start = 0;
        int end = maxHeight;
        int ans = -1;

        // Binary search on possible saw heights
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isValid(arr, k, mid)) {
                // mid is a valid height, try to find a bigger valid height
                ans = mid;
                start = mid + 1;
            } else {
                // mid is too high, reduce saw height
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 15, 10, 17 };
        int k = 7;

        System.out.println(findMaximumHeight(arr, k)); // Output: 15
    }
}