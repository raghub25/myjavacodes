package com.kunal.basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int count = 2;
        while (count * count <= n) {
            if (n % count == 0) {
                return false;
            }
            count++;
        }
        return true;

    }
}
