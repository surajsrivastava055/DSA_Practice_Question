package StringProblems;

import java.util.Map;
import java.util.TreeMap;

// Problem:Most Frequent Character
// Link:https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1
/* Description: Given a string s of lowercase alphabets. The task is to find the maximum occurring
character in the string s. If more than one character occurs the maximum number of times then print
the lexicographically smaller character.
*/
public class Solution13 {

    public static char getMaxOccuringChar(String s) {
        // code here

        // getting frequency of each characters 1st way
        /*
         * int arr[]=new int[26];
         * for(int i=0;i<s.length();i++){
         * char ch=s.charAt(i);
         * arr[ch-'a']++;
         * }
         * 
         * //getting caracter which having max frequency
         * int max=-1;
         * char ans=' ';
         * for(int i=0;i<arr.length;i++){
         * if(max<arr[i]){
         * max=arr[i];
         * ans=(char)(i+'a');
         * }
         * }
         * return ans;
         */

        // getting frequency of each characters 2nd way
        Map<Character, Integer> freq = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // getting caracter which having max frequency
        int max = -1;
        char ans = ' ';
        for (Map.Entry<Character, Integer> ob : freq.entrySet()) {
            if (max < ob.getValue()) {
                max = ob.getValue();
                ans = ob.getKey();
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String str = "testsample";
        System.out.println(getMaxOccuringChar(str));
    }
}
