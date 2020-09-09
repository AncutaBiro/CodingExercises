/*
* b. Se dă un șir de caractere și încă două caractere X și Y.
* Să se mute toate caracterele X la începutul șirului și toate caracterele Y la sfârșitul șirului.
* Ordinea celorlalte caractere din șir rămâne neschimbată.
* Exemplu:
    pentru ”asta este problema de rezolvat” și X='s', Y='a'
    rezultatul este ”sst ete problem de rezolvtaaaa”
    *
 * @author Ancuta Biro
 *         date 09.09.2020
 */

package org.example.JuniorMind;

public class EvaluationExb {

    public static void main(String[] args) {

        String givenString = "asta este problema de rezolvat";
        System.out.println (givenString);

        char X = 's';
        char Y = 'a';

        result(givenString, X, Y);
    }

    public static void result (String list, char X, char Y) {

        int chXNumber = 0;
        int chYNumber = 0;

        StringBuffer operatedList = new StringBuffer(list);

        for (int i = 0; i < operatedList.length(); i++) {

            if (operatedList.charAt(i) == Y) {
                operatedList.deleteCharAt(i);
                chYNumber++;
            }
            if (operatedList.charAt(i) == X) {
                operatedList.deleteCharAt(i);
                chXNumber++;
            }
        }

        for (int i = 0; i < chYNumber; i++) {
            operatedList.append(Y);
        }

        for (int i = 0; i < chXNumber; i++) {
            operatedList.insert(0, X);
        }

        System.out.println(operatedList);
    }
}


