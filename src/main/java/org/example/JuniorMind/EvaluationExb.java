package org.example.JuniorMind;

public class EvaluationExb {

    public static void main(String[] args) {

        String givenString = "asta este problema de rezolvat";
        char X = 's';
        char Y = 'a';

        deleteTheCharacters(givenString, X, Y);
    }

    public static void deleteTheCharacters (String list, char X, char Y) {

        int chXNumber = 0;
        int chYNumber = 0;

        StringBuffer operatedList = new StringBuffer(list);
        System.out.println(operatedList);

        for (int i = 0; i < operatedList.length(); i++) {

//            System.out.print(operatedList.charAt(i));

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


