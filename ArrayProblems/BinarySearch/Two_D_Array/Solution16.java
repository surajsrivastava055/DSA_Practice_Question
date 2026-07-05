package ArrayProblems.BinarySearch.Two_D_Array;

// Problem: Row with Max 1s in Rowwise Sorted
// Link: https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1

/* Description:
You are given a 2D binary array arr[][] consisting of only 1s and 0s. Each row of the array is sorted
in non-decreasing order. Your task is to find and return the index of the first row that contains the
maximum number of 1s. If no such row exists, return -1.

Note:
The array follows 0-based indexing.
The number of rows and columns in the array are denoted by n.
*/
public class Solution16 {

    public static int rowWithMax1s(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;
        int ans = -1;
        int max = 0;

        for (int i = 0; i < rows; i++) {

            int start = 0;
            int end = cols - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[i][mid] == 1) {
                    if (max < cols - mid) {
                        max = cols - mid;
                        ans = i;
                    }
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 0, 1 },
                { 1, 1 }
        };
        System.out.println(rowWithMax1s(arr));
    }
}
