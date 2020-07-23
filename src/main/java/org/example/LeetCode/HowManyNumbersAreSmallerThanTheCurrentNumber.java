package org.example.LeetCode;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {


    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] results = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    counter++;
                }
            }
            results[i] = counter;
        }
        return results;
    }
}
