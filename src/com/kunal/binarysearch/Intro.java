package com.kunal.binarysearch;
//Binary Search rules:
// Valid for sorted array (assume ascending)
// choose mid-element as start + end divide by 2
// if target > mid - go to right side, increment start to mid + 1
// if target < mid - go to left, decrement end to mid - 1
// target = mid, return mid

public class Intro {
    public static void main(String[] args) {
        int[] descArr = {54, 34, 23, 16, 7, 1};
        int target = 7;
        int ans = binarySearch(descArr, target);
        System.out.println(ans);
        int[] ascArr = {1, 7, 16, 23, 34, 54};
        int target2 = 23;
        int ans2 = binarySearch(ascArr, target2);
        System.out.println(ans2);
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2; //this is done to avoid int limit exceeding for large size
            if (target == arr[mid]) {
                return mid;
            }
            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
