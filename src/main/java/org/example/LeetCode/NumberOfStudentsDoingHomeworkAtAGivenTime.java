package org.example.LeetCode;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {

    public static void main(String[] args) {
        int [] startTime = {4};
        int [] endTime = {4};
        int queryTime = 4;

        System.out.println(busyStudent(startTime, endTime, queryTime));

    }
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int result = 0;

        for (int i =0; i< startTime.length; i++) {
                if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                    result++;
                }
        }
        return result;
    }

}
