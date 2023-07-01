package com.kunal.binarysearch;

import java.util.Arrays;

// {5,6,7,8,9,1,2,3}
//  0 1 2 3 4 5 6 7
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 5;
        System.out.println(search(arr, target));
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (target == arr[pivot]) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


}
