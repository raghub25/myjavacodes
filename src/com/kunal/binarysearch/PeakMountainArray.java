package com.kunal.binarysearch;

public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    // {0,1,2,3,4,3,2,1}
    // {1,2,3,4,3,2,1}
    public static int peakIndexInMountainArray(int[] arr) {
       int start = 0;
       int end = arr.length - 1;
       while (start < end) {
           int mid = start + (end - start) / 2;
           if (arr[mid] > arr[mid + 1]) {
               end = mid;
           }
           else {
               start = mid + 1;
           }
       }
       return start;
    }

//    private int binarySearch(int[] arr, int target, int start, int end) {
//    }


}
