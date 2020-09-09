/*
a. Se dă un șir de numere.
Să se mute cel mai mare număr din șir pe prima poziție și cel mai mic pe ultima poziție.
Exemplu:
    pentru 23 4 6 12 34 8 2 19
    rezultatul este 34 4 6 12 23 8 19 2

 * @author Ancuta Biro
 *         date 07.09.2020
 */


package org.example.JuniorMind;

import java.util.ArrayList;
import java.util.List;

public class EvaluationExa {

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

        System.out.println(list);
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
        list.set(list.indexOf(min), list.get(lastIndex));
        list.set(lastIndex, min);


        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }

        }
        list.set(list.indexOf(max), list.get(0));
        list.set(0, max);

        for (Integer i: list)
        System.out.print (i + " ");
    }
}
