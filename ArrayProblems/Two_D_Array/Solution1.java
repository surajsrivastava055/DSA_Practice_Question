package ArrayProblems.Two_D_Array;

import java.util.ArrayList;
import java.util.List;

//Print the sum of each row
public class Solution1 {

    static List<Integer> sumOfEachRow(int arr[][]) {

        List<Integer> data = new ArrayList<>();
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++) {

            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum = sum + arr[i][j];
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
