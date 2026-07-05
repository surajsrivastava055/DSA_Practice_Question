package ArrayProblems.Two_D_Array;

// Problem: Row with Maximum Ones.
// Link: https://leetcode.com/problems/row-with-maximum-ones/description/

/* Description:
Given a m x n binary matrix mat, find the 0-indexed position of the row that contains the maximum
count of ones, and the number of ones in that row.

In case there are multiple rows that have the maximum count of ones,
the row with the smallest row number should be selected.

Return an array containing the index of the row, and the number of ones in it.
*/
public class Solution7 {

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnes = 0;
        int rowIndex = 0;

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOnes) {
                maxOnes = count;
                rowIndex = i;
            }
        }
        return new int[] { rowIndex, maxOnes };
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 0, 1 },
                { 1, 0 }
        };
        int arr1[] = new int[2];
        arr1 = rowAndMaximumOnes(arr);
        System.out.println(arr1[0] + ", " + arr1[1]);
    }
}
