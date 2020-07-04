/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
*/

package org.example.LeetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuffleTheArray {

    public static void main( String[] args )
    {
        int [] nums = {2,5,1,3,4,7};
        int n = 3;
        int [] x = shuffle(nums, n);

        System.out.println(Arrays.toString(x));

        }

    public static int [] shuffle(int[] nums, int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            for (int j = n; j < nums.length; j++) {

                result.add(nums[i]);
                i++;
                result.add(nums[j]);
            }
        }

        int [] resultInt = new int [result.size()];
        for(int i = 0; i < result.size(); i++) {
            resultInt[i] = result.get(i);
        }

        return resultInt;

    }

}
