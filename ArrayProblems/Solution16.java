package ArrayProblems;

// Sort 0's and 1's
public class Solution16 {

    // 1st Way
    static void sort(int arr[]) {
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (i == start) {
                    start++;
                    continue;
                }
                int temp = arr[start];
                arr[start++] = arr[i];
                arr[i] = temp;
            }
        }
        for (int data : arr) {
            System.out.println(data);
        }
    }

    // Second Way Better Approach
    static void sort1(int arr[]) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (arr[start] == 1 && arr[end] == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

            if (arr[start] == 0) {
                start++;
            }

            if (arr[end] == 1) {
                end--;
            }
        }
        for (int data : arr) {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 0, 0, 1, 0, 0, 1, 0, 1 };
        sort(arr);
        sort1(arr);
    }

}
