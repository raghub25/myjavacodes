package com.kunal.binarysearch;

public class CeilingCharacter {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'd', 'k', 'p'};
        char target = 'p';
        char ans = ceiling(arr, target);
        System.out.println(ans);
    }
    static char ceiling(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; //this is done to avoid int limit exceeding for large size
            if (target > letters[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}
