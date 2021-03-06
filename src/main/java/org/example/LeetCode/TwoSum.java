/*
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
* */


package org.example.LeetCode;

import java.util.Arrays;

public class TwoSum {

    public static void main( String[] args )
    {
        int [] nums = {2,7,11,15};
        int target = 9;
        System.out.print (Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {
            for (int i=0; i< nums.length; i++){
                for (int j=i +1; j < nums.length; j++) {
                    if(target - nums[i] == nums[j]) {
                        return new int[]{i,j};
                    }

                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }

}
