package ArrayProblems.Two_D_Array;

import java.util.ArrayList;
import java.util.List;

// Print A Wave Matrix
public class Solution3 {

    static List<Integer> printAWaveMatrix(int arr[][], int rows, int cols) {

        // ArrayList to store data.
        List<Integer> data = new ArrayList<>();
        // for column
        for (int i = 0; i < cols; i++) {
            if ((i & 1) == 0) {
                for (int j = 0; j < rows; j++) {
                    data.add(arr[j][i]);
                }
            } else {
                for (int j = rows - 1; j >= 0; j--) {
                    data.add(arr[j][i]);
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println(printAWaveMatrix(arr, rows, cols));
    }

}
