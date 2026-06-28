package ArrayProblems.BinarySearch;

// find the peak index in a mountain array.
public class Solution3 {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= arr[mid + 1]) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 3, 2, 1 };
        System.out.println(peakIndexInMountainArray(arr));
    }

}
