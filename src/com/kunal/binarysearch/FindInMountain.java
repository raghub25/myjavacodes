package com.kunal.binarysearch;

class MountainArray {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82};
    int length() {
        return arr.length;
    }
    int get(int num) {
        return arr[num];
    }
}

public class FindInMountain {
    public static void main(String[] args) {
        MountainArray array = new MountainArray();
        System.out.println(findInMountainArray(1, array));
    }
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int[] arr = new int[mountainArr.length()];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = mountainArr.get(i);
        }
        int peak = peakIndexInMountainArray(arr);
        int start = 0;
        int end = peak;
        int startIndex = binarySearch(arr, target, true, start, end);
        if (startIndex == -1) {
            start = peak;
            end = arr.length - 1;
            return binarySearch(arr, target, false, start, end);
        }
        return startIndex;
    }

    private static int binarySearch(int[] arr, int target, boolean isAscending, int start, int end) {
        int ans = -1;
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
        return ans;
    }

    private static int peakIndexInMountainArray(int[] arr) {
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
}
