package ArrayProblems;

// sort the array which containing only 0, 1, and 2
public class Solution19 {

    // 1nd way
    static void sort(int arr[]) {

        int n = arr.length;

        if (arr == null || n == 0) {
            throw new RuntimeException("Invalid Input");
        }

        int start = 0;
        int mid = 0;
        int end = n - 1;

        while (mid <= end) {
            if (arr[mid] == 0) {
                int temp = arr[start];
                arr[start++] = arr[mid];
                arr[mid++] = temp;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[end];
                arr[end--] = arr[mid];
                arr[mid] = temp;
            }
        }

        for (int data : arr) {
            System.out.println(data);
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 0, 0, 1, 2, 1, 0, 2, 2, 0, 1, 0 };
        sort(arr);
    }

}
