package ArrayProblems.BinarySearch;

// Problem:
// Link:https://leetcode.com/problems/single-element-in-a-sorted-array/
/*
     * Problem Statement:
     * You are given a sorted array where every element appears exactly twice,
     * except for one element which appears only once.
     * 
     * Find and return that single element in O(log n) time and O(1) space.
     * 
     * Example:
     * Input: [1,1,2,3,3,4,4,8,8]
     * Output: 2
     * 
     * Input: [3,3,7,7,10,11,11]
     * Output: 10
*/
public class Solution13 {

    public static int findNonDulicateElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if ((mid & 1) == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }

        // start == end, pointing to the single element
        return nums[start];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4 };

        System.out.println(findNonDulicateElement(arr));
    }

}
