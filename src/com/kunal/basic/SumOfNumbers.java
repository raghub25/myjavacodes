package com.kunal.basic;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the total number of integers you want to add: ");
        int n = s.nextInt();
        int count = 1, negSum = 0, posEvenSum = 0, posOddSum = 0, num = 0;
        while (count <= n) {
            num = s.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 0) {
                negSum += num;
            }
            else {
                if (num % 2 == 0) {
                    posEvenSum += num;
                }
                else {
                    posOddSum += num;
                }
            }
            count++;
        }
            System.out.println("The sum of negative numbers is " + negSum);
            System.out.println("The sum of positive even numbers is " + posEvenSum);
            System.out.println("The sum of positive odd numbers is " + posOddSum);

    }
}
