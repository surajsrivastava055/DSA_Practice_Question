package ArrayProblems;

// Find the Pivet Index.
public class Solution24 {

    static void findPivetIndex(int nums[]) {

        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            arr1[i] = sum;
        }
        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            arr2[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            if (arr1[i] == arr2[i]) {
                System.out.println(i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 7, 2, 3, 4, 5, 5, 3, 2, 2, 4 };

        findPivetIndex(arr);
    }
}
