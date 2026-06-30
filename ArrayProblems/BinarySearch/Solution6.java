package ArrayProblems.BinarySearch;

// Find the SQRT(X) by using binary search.
// Leet Code Link: https://leetcode.com/problems/sqrtx/
public class Solution6 {

    public static double mySqrt(int x) {

        int start = 1;
        int end = x / 2;
        double ans = -1;

        if (x == 0 || x == 1) {
            return x;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // to avoid interger overflow used mid<=x/mid instead of mid*mid <= x
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Extra work for precision point.
        double factor = 1;
        double data = ans;
        for (int i = 0; i < 3; i++) {
            factor = factor / 10;
            ans = data;
            for (int j = 1; j <= 9; j++) {
                double candidate = (factor * j) + ans;
                if (candidate * candidate <= x) {
                    data = candidate;
                } else {
                    break;
                }
            }
        }
        return data;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }

}
