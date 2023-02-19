package com.kunal.basic;

import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int occur = s.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == occur) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
