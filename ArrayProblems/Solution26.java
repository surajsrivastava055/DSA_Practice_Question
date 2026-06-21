package ArrayProblems;

public class Solution26 {

    static int findMaxSubArray(int arr[]) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            // calculate sum
            sum = sum + arr[i];

            // find Maximum
            max = Math.max(max, sum);

            // skiping is sum is negative
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println(findMaxSubArray(arr));
    }

}
