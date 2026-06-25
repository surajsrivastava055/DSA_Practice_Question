package ArrayProblems.BinarySearch;

public class Solution2 {

    static int lowerBound(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static int countFrequency(int arr[], int target) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        int ub = upperBound(arr, target);
        int lb = lowerBound(arr, target);
        return ub - lb;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 45, 67, 89, 100, 100, 100, 100, 233, 444, 456, 789 };
        int target = 100;
        int result = countFrequency(arr, target);
        System.out.println(result);
    }

}
