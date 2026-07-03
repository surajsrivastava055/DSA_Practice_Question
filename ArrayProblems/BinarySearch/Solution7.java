package ArrayProblems.BinarySearch;

/*Problem: Given an array arr[] of integers, where each element arr[i] represents the number of pages 
in the i-th book. You also have an integer k representing the number of students. The task is to allocate
books to each student such that:

Each student receives atleast one book.
Each student is assigned a contiguous sequence of books.
No book is assigned to more than one student.
All books must be allocated.
The objective is to minimize the maximum number of pages assigned to any student. In other words,
 out of all possible allocations, find the arrangement where the student who receives the most pages
still has the smallest possible maximum.

Note: If it is not possible to allocate books to all students, return -1.
 */
// GFG Link: https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
public class Solution7 {

    public static boolean isValid(int[] arr, int mid, int k) {

        int countBooks = 1;
        int pages = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + pages <= mid) {
                pages = arr[i] + pages;
            } else {
                countBooks++;
                if (countBooks > k) {
                    return false;
                }
                if (arr[i] > mid) {
                    return false;
                }
                pages = arr[i];
            }
        }
        return true;

    }

    public static int findPages(int[] arr, int k) {

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
            if (isValid(arr, mid, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 8, 9, 7 };
        int k = 2;
        System.out.println(findPages(arr, k));

    }

}
