package ArrayProblems.Sorting;

public class SelectionSort {

    static int[] selectionSort(int arr[]) {

        int n = arr.length;

        // No of pass
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            // comprision
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // to avoid unnecessary swap.
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 9, 3, 6, 2, 7, 1 };
        int arr1[] = selectionSort(arr);
        for (int i : arr1) {
            System.out.println(i);
        }
    }

}
