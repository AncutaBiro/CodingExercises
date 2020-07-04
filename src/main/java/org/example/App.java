package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        int [] x = {1,1,1,1};
        x = runningSum(x);
        System.out.print(Arrays.toString(x));

    }


    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            result[i] = sum;
        }

        return result;
    }
}
