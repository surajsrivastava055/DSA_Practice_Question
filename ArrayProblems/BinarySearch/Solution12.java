package ArrayProblems.BinarySearch;

/*
Link: https://www.geeksforgeeks.org/problems/search-in-an-almost-sorted-array/1
Problem Statement:
Given a nearly sorted array and a target element,
find the index of the target.

A nearly sorted array means:
- if an element should be at index i in a fully sorted array,
  it may be present at:
    i
    i - 1
    i + 1

Return the index of the target if found, otherwise return -1.

Example:
arr = {5, 10, 30, 20, 40}
target = 20

Output: 3
*/

public class Solution12 {

    /*
     * Searches target in a nearly sorted array using modified binary search.
     */
    public static int findTarget(int[] arr, int target) {

        // Edge case: empty or null array
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Check middle element
            if (arr[mid] == target) {
                return mid;
            }

            // Check left neighbor of mid
            if (mid > 0 && arr[mid - 1] == target) {
                return mid - 1;
            }

            // Check right neighbor of mid
            if (mid < arr.length - 1 && arr[mid + 1] == target) {
                return mid + 1;
            }

            /*
             * Since mid, mid-1, and mid+1 are already checked,
             * move search space by 2 positions.
             */
            if (arr[mid] < target) {
                start = mid + 2;
            } else {
                end = mid - 2;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int target = 2;

        System.out.println(findTarget(arr, target)); // Output: 1
    }
}