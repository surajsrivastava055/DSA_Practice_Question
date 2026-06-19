package ArrayProblems;

// Given an array nums containing n distinct(diffrent) numbers
// taken from 0,1,2,3,...n, find the one that is missing from the array
public class Solution18 {

    // 1st Way
    static int findUniqueElement(int arr[]) {

        int n = arr.length;

        if (arr == null || n == 0) {
            throw new RuntimeException("Invalid Input");
        }
        int xor = 0;
        for (int data : arr) {
            xor ^= data;
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 0, 1, 3, 2, 2, 0, 1 };

        int num = findUniqueElement(arr);
        System.out.println("Unique Number is:" + num);
    }

}
