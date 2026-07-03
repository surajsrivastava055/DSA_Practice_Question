package ArrayProblems.BinarySearch;

/*
Problem Statement:
You are given the ranks of cooks and the number of parathas to cook.

A cook with rank R cooks parathas in the following pattern:
- 1st paratha in R minutes
- 2nd paratha in 2R minutes
- 3rd paratha in 3R minutes
and so on...

If a cook has rank 3:
- 1st paratha -> 3 min
- 2nd paratha -> 6 min
- 3rd paratha -> 9 min

Total time for 3 parathas = 3 + 6 + 9 = 18 minutes

Task:
Find the minimum time required to cook exactly/at least n parathas
using all cooks together.

Example:
ranks = {1, 2, 3, 4}
n = 10

Output:
12
*/

public class Solution11 {

    /*
     * Checks whether it is possible to cook at least 'n' parathas
     * within the given 'mid' time.
     */
    public static boolean isValid(int[] ranks, int n, long mid) {
        int totalParathas = 0;

        // Check contribution of each cook
        for (int i = 0; i < ranks.length; i++) {
            long timeTaken = 0;
            int parathaNumber = 1;

            /*
             * For a cook with rank R:
             * 1st paratha takes R * 1
             * 2nd paratha takes R * 2
             * 3rd paratha takes R * 3
             * ...
             */
            while (timeTaken + (long) parathaNumber * ranks[i] <= mid) {
                timeTaken += (long) parathaNumber * ranks[i];
                totalParathas++;
                parathaNumber++;

                // Early return if enough parathas are cooked
                if (totalParathas >= n) {
                    return true;
                }
            }
        }

        return false;
    }

    /*
     * Finds the minimum time needed to cook n parathas.
     * Uses binary search on the answer (time).
     */
    public static long findMinimumTimeToCookParatha(int[] ranks, int n) {

        if (ranks == null || ranks.length == 0 || n <= 0) {
            return -1;
        }

        // Find the fastest cook (minimum rank)
        int minRank = ranks[0];
        for (int i = 1; i < ranks.length; i++) {
            if (ranks[i] < minRank) {
                minRank = ranks[i];
            }
        }

        long start = 0;

        /*
         * Upper bound:
         * Assume the fastest cook alone cooks all n parathas.
         * Time = R * (1 + 2 + 3 + ... + n)
         * = R * n * (n + 1) / 2
         */
        long end = (long) minRank * n * (n + 1) / 2;

        long ans = -1;

        // Binary search on time
        while (start <= end) {
            long mid = start + (end - start) / 2;

            if (isValid(ranks, n, mid)) {
                ans = mid; // mid time is enough
                end = mid - 1; // try to find smaller valid time
            } else {
                start = mid + 1; // need more time
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] ranks = { 1, 2, 3, 4 };
        int n = 10;

        System.out.println(findMinimumTimeToCookParatha(ranks, n)); // 12
    }
}