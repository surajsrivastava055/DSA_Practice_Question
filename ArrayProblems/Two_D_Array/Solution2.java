package ArrayProblems.Two_D_Array;

import java.util.ArrayList;
import java.util.List;

//Print the sum of each column
public class Solution2 {

    static List<Integer> sumOfEachRow(int arr[][]) {

        List<Integer> data = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < col; i++) {

            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum = sum + arr[j][i];
            }
            data.add(sum);
        }
        return data;
    }

    public static void main(String[] args) {
        int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(sumOfEachRow(arr));
    }

}
