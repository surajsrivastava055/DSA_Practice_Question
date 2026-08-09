package StringProblems;

// Problem: Permutation in string
// Link: https://leetcode.com/problems/permutation-in-string/description/
/* Description:
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.
*/
public class Solution16 {

    public static boolean isValid(int count1[], int count2[]) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int count1[] = new int[26];
        int count2[] = new int[26];

        // assigning table to s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            count1[ch - 'a']++;
        }

        // 1st window
        int i = 0;
        for (; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            count2[ch - 'a']++;
        }

        if (isValid(count1, count2)) {
            return true;
        } else {
            for (int j = i; j < s2.length(); j++) {
                // adding new char from s2 table
                char ch = s2.charAt(j);
                count2[ch - 'a']++;

                // removing old char from s2 table
                char ch1 = s2.charAt(j - s1.length());
                count2[ch1 - 'a']--;
                // System.out.println(ch1);

                if (isValid(count1, count2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

}
