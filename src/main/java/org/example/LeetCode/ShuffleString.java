
/*Given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.

Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.*/

package org.example.LeetCode;

import java.util.*;

public class ShuffleString {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String result = restoreString(s, indices);
        System.out.println(result);
    }

    public static String restoreString(String s, int[] indices) {

        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }

        HashMap<Integer, Character> hash = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            hash.put(indices[i], ch[i]);
        }

        StringBuilder hashAsString = new StringBuilder();
        for (Map.Entry<Integer, Character> value : hash.entrySet()) {
            hashAsString.append(((Map.Entry) value).getValue());
        }
        return hashAsString.toString();
    }

//    public String restoreString(String s, int[] indices) {
//
//        char[] ch = new char[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            ch[indices [i]] = s.charAt(i);
//        }
//        return String.valueOf(ch);
//    }

}
