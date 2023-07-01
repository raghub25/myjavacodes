package com.kunal.binarysearch;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println(search(10, 6));
    }

    static int search(int n, int target) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int pick = guess(mid, target);
            if (pick == -1) {
                start = mid + 1;
            }
            else if (pick == 1) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    private static int guess(int num, int pick) {
        if (num > pick) {
            return -1;
        }
        else if (num < pick) {
            return 1;
        }
        return 0;
    }
}
