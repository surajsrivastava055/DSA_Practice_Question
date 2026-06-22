package ArrayProblems.Two_D_Array;

// Rotate array by 90 degree.
public class Solution5 {

    static int[][] rotateMatrixByNintyDegree(int arr[][], int N) {

        // Step 1 transpose the matrix.
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // step 2 reverse each row using 2 pointer
        for (int i = 0; i < N; i++) {
            int start = 0, end = N - 1;
            while (start <= end) {
                int temp = arr[i][start];
                arr[i][start++] = arr[i][end];
                arr[i][end--] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int N = arr.length;

        int arr1[][] = rotateMatrixByNintyDegree(arr, N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + arr1[i][j]);
            }
            System.out.println();
        }
    }

}
