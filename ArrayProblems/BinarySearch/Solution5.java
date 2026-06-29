package ArrayProblems.BinarySearch;

public class Solution5 {

    // Search target in rotated array using binary search.
    class Solution4 {

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

        public static int searchData(int arr[], int start, int end, int target) {
            int ans = -1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    ans = mid;
                    break;
                }
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return ans;
        }

        public static int search(int[] nums, int target) {
            int pivotIndex = findPivotIndex(nums);

            int startArray1 = 0;
            int endArray1 = pivotIndex;

            int startArray2 = pivotIndex + 1;
            int endArray2 = nums.length - 1;

            int ans = -1;

            if (pivotIndex == -1) {
                return searchData(nums, startArray1, endArray2, target);
            }
            if (nums[startArray1] <= target && target <= nums[pivotIndex]) {
                ans = searchData(nums, startArray1, endArray1, target);
            } else {
                ans = searchData(nums, startArray2, endArray2, target);
            }
            return ans;
        }

        public static void main(String[] args) {
            int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
            int target = 0;
            System.out.println(search(arr, target));
        }
    }
}
