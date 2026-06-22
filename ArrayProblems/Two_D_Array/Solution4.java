package ArrayProblems.Two_D_Array;

// Transpose A Matrix -> columns becoms rows, and rows becomes columns
public class Solution4 {

    static int[][] printTranspostOfMatrix(int arr[][], int rows, int cols) {

        // 2'D Array to store data.
        int arr1[][] = new int[cols][rows];

        // for column
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                arr1[i][j] = arr[j][i];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        int rows = arr.length;
        int cols = arr[0].length;

        int arr1[][] = printTranspostOfMatrix(arr, rows, cols);
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(" " + arr1[i][j]);
            }
            System.out.println();
        }
    }

}
