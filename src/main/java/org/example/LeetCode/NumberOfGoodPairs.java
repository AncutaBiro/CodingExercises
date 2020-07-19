/*Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 *
 */

package org.example.LeetCode;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {

        int numIdenticalPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    numIdenticalPairs++;
                }
            }
        }
        return numIdenticalPairs;
}

}
