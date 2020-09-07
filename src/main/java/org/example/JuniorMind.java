package org.example;

import java.util.ArrayList;
import java.util.List;

public class JuniorMind {

    public static void main(String[] args) {
        List<Integer> unsortedList = new ArrayList<>();
        unsortedList.add(23);
        unsortedList.add(4);
        unsortedList.add(6);
        unsortedList.add(12);
        unsortedList.add(34);
        unsortedList.add(8);
        unsortedList.add(2);
        unsortedList.add(19);

        System.out.println(list(unsortedList));


    }

    public static List<Integer> list (List<Integer> unsortedList) {

        int min = unsortedList.get(0);
        int max = unsortedList.get(0);
        int lastIndex = unsortedList.size() - 1;

        for (int i = 1; i < unsortedList.size(); i++) {
            if (unsortedList.get(i) < min){
                min = unsortedList.get(i);
            }

        }
        System.out.println(min);
        System.out.println(lastIndex);

//        unsortedList.set (unsortedList.indexOf(min), unsortedList.get(lastIndex));
//        unsortedList.set (unsortedList.get(lastIndex), min);


        for (int i = 1; i< unsortedList.size(); i++) {
            if (unsortedList.get(i) > max){
                max = unsortedList.get(i);
            }

        }
        System.out.println(max);

        unsortedList.set (unsortedList.indexOf(max), unsortedList.get(0));
        unsortedList.set (0, max);



        return unsortedList;
    }
}
