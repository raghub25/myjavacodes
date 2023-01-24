package com.udemy.arrays;

import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = readIntegers(1);
        System.out.println("The min element is " + findMin(array));
    }

    public static int[] readIntegers(int count) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[count];
        System.out.println("Enter the numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        if (array.length < 2) {
            return min;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
