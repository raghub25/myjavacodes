package com.kunal.binarysearch;

public class StartEnd {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int ans[] = startEnd(arr, target);
        for (int i : ans) {
            System.out.println(i);
        }
    }
    static int[] startEnd(int[] arr, int target) {
        int[] ans = {-1, -1};
        ans[0] = searchTarget(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = searchTarget(arr, target, false);
        }
        return ans;
    }

    private static int searchTarget(int[] arr, int target, boolean findStartIndex) {
        int start = 0;
        int ans = -1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; //this is done to avoid int limit exceeding for large size
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else if (target > arr[mid] ){
                    start = mid + 1;
                }
                else {
                    ans = mid;
                    if (findStartIndex) {
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }
                } // {5,6,7,8,9,1,2,3}
        }         //  0 1 2 3 4 5 6 7
        return ans;
    }
}
