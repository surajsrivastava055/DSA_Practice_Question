package ArrayProblems.Sorting;

public class BubbleSort {

    static int[] bubbleSort(int[] arr) {

        int n = arr.length;
        // No of the pass
        for (int i = 1; i < n; i++) {
            // to check if no swap happend
            boolean swapped = false;
            // Total swaps
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 9, 3, 6, 2, 7, 1 };
        int arr1[] = bubbleSort(arr);
        for (int i : arr1) {
            System.out.println(i);
        }
    }

}
