package com.kunal.basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinimumNumber {
    public static void main(String[] args) {
      int[] arr = {3, 4, 6, 2, 7, 1, 9};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
