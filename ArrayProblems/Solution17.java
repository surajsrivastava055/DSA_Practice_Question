package ArrayProblems;

// Given an array nums containing n distinct(diffrent) numbers
// taken from 0,1,2,3,...n, find the one that is missing from the array
public class Solution17 {

    // 1st Way
    static int findMissingElement(int arr[]) {

        int n = arr.length;

        if (arr == null || n == 0) {
            throw new RuntimeException("Invalid Input");
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int sum1 = (n * (n + 1)) / 2;
        return sum1 - sum;
    }

    // 2nd way using xor Better Approach
    static int findMissingElement1(int arr[]) {

        int n = arr.length;

        if (arr == null || n == 0) {
            throw new RuntimeException("Invalid Input");
        }

        int xor = 0;
        for (int i = 0; i <= arr.length; i++) {
            xor ^= i;
        }

        for (int i : arr) {
            xor ^= i;
        }

        return xor;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 3, 2, 5, 6, 7, 8 };

        int num = findMissingElement1(arr);
        System.out.println("Missing Number is:" + num);
    }

}
