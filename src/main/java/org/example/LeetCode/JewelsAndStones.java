package org.example.LeetCode;

public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }

    public static int numJewelsInStones(String J, String S) {

        int numberOfJewelsInStones = 0;

        for (int j=0; j < J.length(); j++) {
            for (int i=0; i < S.length(); i++) {
                if (J.charAt(j) == S.charAt(i)) {
                    numberOfJewelsInStones++;
                }
            }
        }
        return numberOfJewelsInStones;
    }
}










