package ArrayProblems.BinarySearch;

// Binary Search alkgorithm
//In this array u r provided with a sorted array of integers array and a integer target
//- your task is to implement a binary search algorithm to find the index nof target array.
public class Solution1 {

    static int binarySearch(int arr[], int target) {

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        // Handling invalid input
        if (arr == null || arr.length == 0) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // checking target is found or not
            if (arr[mid] == target) {
                return mid;
            }
            // If target is greater, search the right half; otherwise, search the left half.
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 45, 67, 89, 100, 233, 444, 456, 789 };
        int target = 444;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

}
