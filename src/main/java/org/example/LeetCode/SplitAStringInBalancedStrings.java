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
