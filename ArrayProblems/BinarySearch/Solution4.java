package ArrayProblems.BinarySearch;

//Find the Pivot Index of a Rotated Array.
public class Solution4 {

    public static int findPivotIndex(int arr[]) {
        int n = arr.length - 1;
        int start = 0;
        int end = n;
        int ans = 0;

        if (arr[start] < arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[n]) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findPivotIndex(arr));
    }

}
