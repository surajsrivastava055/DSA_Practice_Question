package StringProblems;

//Problem: Reverse Words in a String
//Link:https://leetcode.com/problems/reverse-words-in-a-string/description/
/* Description:
Given an input string s, reverse the order of the words. A word is defined as a sequence of non-space 
characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
*/
public class Solution12 {

    public static String reverseWords(String s) {

        // 1st way Not too good
        /*
         * StringBuilder sb=new StringBuilder();
         * String arr[]=s.trim().split("\\s+");
         * for(int i=arr.length-1;i>=0;i--){
         * sb.append(arr[i]);
         * if(i!=0){
         * sb.append(" ");
         * }
         * }
         * return sb.toString();
         */

        // 2nd way Better and Best

        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            // remove the spaces from trailing
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            // checking valid indexs;
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // storing word into sb
            if (j < s.length() - 1) {
                sb.append(s.substring(j + 1, i + 1));
            }

            // removing space between words
            while (j >= 0 && s.charAt(j) == ' ') {
                j--;
            }

            // adding space
            if (j >= 0) {
                sb.append(' ');
            }
            i = j;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello I am Gyan";
        System.out.println(reverseWords(str));
    }
}
