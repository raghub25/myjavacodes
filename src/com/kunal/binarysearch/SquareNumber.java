package com.kunal.binarysearch;

public class SquareNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == (float) num) {
                return true;
            }
            else if (mid * mid > (float) num) {
                end =  mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}
