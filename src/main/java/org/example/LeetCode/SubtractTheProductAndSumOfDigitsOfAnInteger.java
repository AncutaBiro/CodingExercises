package org.example.LeetCode;

/*Given an integer number n, return the difference between the product of its digits and the sum of its digits.
Example 1:
Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
*/

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        String nString = Integer.toString(n);
        char[] nChar = nString.toCharArray();
        int[] nInteger = new int[nChar.length];
        int sum = 0;
        int product = 1;

        for (int i = 0; i < nChar.length; i++) {
            nInteger[i] = Character.getNumericValue(nChar[i]);
        }

        for (int value : nInteger) {
            sum = sum + value;
            product = product * value;
        }

        return product - sum;
    }
}

//class Test {
//    public static void main(String args[]) {
//        int x = 5;
//        System.out.println(x++);
//        //output 5
//    }
//}

//Dupa inițializarea serverului Tomcat pe mașina locală, cum pot afla dacă acesta funcționează?
//        Select one:
//        A.
//        prin rularea din Terminal a comenzii: “sudo chmod +x Tomcat”
//        X B.
//        prin accesarea într-un browser a adresei “localhost” și a portului 8080 pe care îl folosește Tomcat,
//        ex:  http://localhost:8080
//        C.
//        prin accesarea interfeței Workbench sau HeidiSQL pentru a vedea dacă este pornit serverul

