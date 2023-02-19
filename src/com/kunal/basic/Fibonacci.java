package com.kunal.basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        for(int count = 2; count <= n; count++) {
            int temp = b;
            b += a;
            a = temp;
        }
        System.out.println(b);
    }
}
