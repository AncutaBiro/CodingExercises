package org.example.JuniorMind;

public class EvaluationExb {

    public static void main(String[] args) {

        String givenString = "asta este problema de rezolvat";
        char X = 's';
        char Y = 'a';
        String newList = givenString.replace("a", "");
        String neeeewwList = newList.replace("s", "");
        System.out.println(neeeewwList);

        deleteTheCharacters(givenString, X, Y);
//        rearrange(givenString, x, y);
    }

    public static void deleteTheCharacters(String list, char X, char Y) {

        StringBuffer operatedList = new StringBuffer(list);

        char[] listChar = list.toCharArray();

        for (int i = 0; i < list.length(); i++) {
            System.out.print(operatedList.charAt(i));

            if (operatedList.charAt(i) == X) {
                operatedList.deleteCharAt(i);
            }
        }

        System.out.println();
        System.out.println(operatedList);
    }
}



//        IntStream stream =  list.chars();
//
//        List<Item> operatedList = new ArrayList<>();
//        listChar.stream()
//                .filter(item -> item.isQualified())
//                .forEach(item -> {
//                    item.operate();
//                    operatedList.add(item);
//                });
//        itemList.removeAll(operatedList);
//        stream.remo
//
//        / return the resultant array
//        return stream.range(0, list.length())
//                .filter(i -> i != index)
//                .map(i -> arr[i])
//                .toArray();


//        String newString = S.replaceAll("[as]", "");


//        list.set(list.indexOf(min), list.get(lastIndex));
//        list.set(lastIndex, min);
//
//
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i) > max) {
//                max = list.get(i);
//            }
//
//        }
//        list.set(list.indexOf(max), list.get(0));
//        list.set(0, max);
//
//        System.out.println(list);
//    }

