/*
* The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation
Fn = Fn-1 + Fn-2
with seed values
F0 = 0 and F1 = 1.
Given a number n, print n-th Fibonacci Number.
*
Examples:
*
*
Input  : n = 2
Output : 1
Input  : n = 9
Output : 34
 *
* .*/

package org.example.GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

// Dynamic Programming
    public static void main(String[] args) {
        int n = 9;
        System.out.print(fib(n));
    }

    public static int fib(int n) {
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        for (int i = 2; i <= n; i++) {
            fib.add(fib(i - 1) + fib(i - 2));
        }
        return fib.get(n);
    }

// Space Optimized Method
//    public static int fib(int n) {
//        List<Integer> fib = new ArrayList<>();
//        int a = 0;
//        int b = 1;
//        int c;
//
//        fib.add(a);
//        fib.add(b);
//
//        for (int i = 0; i <= n; i++) {
//            c = a + b;
//            fib.add(c);
//            a = b;
//            b = c;
//        }
//        return fib.get(n);
//    }

}

