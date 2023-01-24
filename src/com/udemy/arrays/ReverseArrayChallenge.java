package com.udemy.arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(array);
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int[] reverseArray = new int[10];
        for (int i = maxIndex; i >= 0; i--) { //{1,2,3,4,5}
            reverseArray[maxIndex - i] = array[i];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
