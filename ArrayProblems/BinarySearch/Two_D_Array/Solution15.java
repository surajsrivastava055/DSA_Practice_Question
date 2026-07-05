package ArrayProblems.BinarySearch.Two_D_Array;

// Problem: Search a 2D Matrix II
// Link: https://leetcode.com/problems/search-a-2d-matrix-ii/description/

/* Discription:
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
*/
public class Solution15 {

    public static boolean searchMatrix(int[][] matrix, int target) {

        // 1st approach
        int rows = 0;
        int cols = matrix[0].length - 1;

        while (rows < matrix.length && cols >= 0) {
            if (matrix[rows][cols] == target) {
                return true;
            }
            if (matrix[rows][cols] > target) {
                cols--;
            } else {
                rows++;
            }
        }
        return false;

        // 2nd approach
        /*
         * int rows=matrix.length-1;
         * int cols=0;
         * 
         * while( rows >= 0 && cols < matrix[0].length ){
         * if( matrix[rows][cols] == target ){
         * return true;
         * }
         * if(matrix[rows][cols] > target){
         * rows--;
         * }else{
         * cols++;
         * }
         * }
         * return false;
         */
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 4, 7, 11, 15 },
                { 2, 5, 8, 12, 19 },
                { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 }
        };
        int target = 5;
        System.out.println(searchMatrix(arr, target));
    }

}
