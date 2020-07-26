/*
Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.

Examples :

Input : arr[] = {0, -1, 2, -3, 1}
Output : (0 -1 1), (2 -3 1)

Explanation : The triplets with zero sum are
0 + -1 + 1 = 0 and 2 + -3 + 1 = 0

Input : arr[] = {1, -2, 1, 0, 5}
Output : 1 -2  1
Explanation : The triplets with zero sum is
1 + -2 + 1 = 0
* */

package org.example.GeeksForGeeks;

public class FindAllTripletsWithZeroSum {

    public static void main(String[] args) {
        int [] a = {8, 2, -1, -1, 15};
        threeSum(a);
    }

    public static void threeSum(int[] a) {

        int n = a.length;
        boolean result = false;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        result = true;
                    }
                }
            }
        }
        if (!result)
        System.out.println("there are NOT 3 elements that sum to 0");
    }
}