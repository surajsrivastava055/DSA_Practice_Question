package ArrayProblems.Sorting;

public class InsertionSort {

    static void insertionSort(int arr[]) {

        int n = arr.length;
        // no of pass
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 9, 3, 6, 2, 7, 1 };
        insertionSort(arr);

    }

}
