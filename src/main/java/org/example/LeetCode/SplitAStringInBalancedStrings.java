/*Balanced strings are those who have equal quantity of 'L' and 'R' characters.
Given a balanced string s split it in the maximum amount of balanced strings.
Return the maximum amount of splitted balanced strings.

Example 1:
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
* */

package org.example.LeetCode;

public class SplitAStringInBalancedStrings {

    public static void main(String[] args) {

        String s = "RLRRRLLRLL";

        System.out.println(balancedStringSplit(s));
    }


    public static int balancedStringSplit(String s) {
        int totalR = 0;
        int count = 0;

        char[] charS = s.toCharArray();

        for (char i : charS) {
            if (i == 'R') {
                totalR++;
            } else
                totalR--;

            if (totalR == 0) {
                count++;
            }
        }
        return count;
    }
}
