package ArrayProblems.BinarySearch;

/* Problem: Given an array arr[] where each element denotes the length of a board,
 and an integer k representing the number of painters available. Each painter takes 1 unit
of time to paint 1 unit length of a board.

Determine the minimum amount of time required to paint all the boards, under the constraint that each
painter can paint only a contiguous sequence of boards (no skipping or splitting allowed).
*/
// GFG Link:https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1
public class Solution8 {

    public static boolean isValid(int mid, int[] arr, int k) {

        int countPainter = 1;
        int unitPainted = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + unitPainted <= mid) {
                unitPainted = arr[i] + unitPainted;
            } else {
                countPainter++;
                if (countPainter > k) {
                    return false;
                }
                if (arr[i] > mid) {
                    return false;
                }
                unitPainted = arr[i];
            }
        }
        return true;
    }

    public static int minTime(int[] arr, int k) {

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        int start = 1;
        int end = sum;
        int ans = -1;

        if (arr.length < k) {
            return ans;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(mid, arr, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 30, 20, 15 };
        int k = 3;
        System.out.println(minTime(arr, k));
    }

}
