package org.example;

import java.util.ArrayList;
import java.util.List;

public class JuniorMind {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(4);
        list.add(6);
        list.add(12);
        list.add(34);
        list.add(8);
        list.add(2);
        list.add(19);

        rearrange(list);
    }

    public static void rearrange (List<Integer> list) {

        int min = list.get(0);
        int max = list.get(0);
        int lastIndex = list.size() - 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }

        }
        System.out.println(min);

        list.set(list.indexOf(min), list.get(lastIndex));
        list.set(lastIndex, min);


        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }

        }
        System.out.println(max);

        list.set(list.indexOf(max), list.get(0));
        list.set(0, max);

        System.out.println(list);
    }
}
