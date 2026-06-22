package ArrayProblems.Two_D_Array;

import java.util.*;

//Printing Spriral Matrix
public class Solution6 {

    static List<Integer> printingSpiralMatrix(int arr[][], int N, int M) {

        // Taking variable
        int startingRow = 0;
        int endingRow = N - 1;
        int startingColumn = 0;
        int endingColumn = M - 1;

        // initilizing ArrayList to store the data
        List<Integer> data = new ArrayList<>();

        // adding condition
        while (startingRow <= endingRow && startingColumn <= endingColumn) {

            // row wise left to right -> need to print stratingCol, from startingColumn to
            // endingColumn.
            for (int i = startingColumn; i <= endingColumn; i++) {
                data.add(arr[startingRow][i]);
            }
            startingRow++;

            // column wise top to bottom -> need to print ending col, from startingRow to
            // Ending Row
            for (int i = startingRow; i <= endingRow; i++) {
                data.add(arr[i][endingColumn]);
            }
            endingColumn--;

            // row wise right to left -> need to print ending Row, from endingColumn to
            // stratingColumn
            if (startingRow <= endingRow) {
                for (int i = endingColumn; i >= startingColumn; i--) {
                    data.add(arr[endingRow][i]);
                }
            }
            endingRow--;

            // col wise bottom to top -> need to print stratingCol, from endingRow to
            // StartingRow
            if (startingColumn <= endingColumn) {
                for (int i = endingRow; i >= startingRow; i--) {
                    data.add(arr[i][startingColumn]);
                }
            }
            startingColumn++;
        }

        return data;
    }

    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3, 4 } };
        int N = arr.length;
        int M = arr[0].length;

        System.out.println(printingSpiralMatrix(arr, N, M));
    }
}
