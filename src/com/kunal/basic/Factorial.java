package com.kunal.basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n) {
        int factorial = 1;
        if (n != 0) {
            for (int i = 1; i <= n ; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
}
