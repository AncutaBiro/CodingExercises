package org.example.LeetCode;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {

    public static void main(String[] args) {
        int [] startTime = {1,1,1,1};
        int [] endTime = {1,3,2,4};
        int queryTime = 7;

        System.out.println(busyStudent(startTime, endTime, queryTime));

    }
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int result = 0;

        for (int i =0; i< startTime.length; i++) {
                if ( endTime[i] - startTime [i] > queryTime) {
                    result++;
            }
        }
        return result;
    }


}
