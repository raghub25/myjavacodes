package com;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//256741038 623958417 467905213 714532089 938071625

public class HackerRank {
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
//        arr.add(256741038);
//        arr.add(623958417);
//        arr.add(467905213);
//        arr.add(714532089);
//        arr.add(938071625);
//        List<Integer> ascen = arr.stream().sorted().collect(Collectors.toList());
//        ascen.remove(ascen.size() - 1);
//        long min = ascen.stream().mapToLong(Integer::intValue).sum();
//        List<Integer> descen = arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        descen.remove(descen.size() - 1);
//        long max = descen.stream().mapToLong(Integer::intValue).sum();
//        System.out.println(min + " " + max);
//        Integer[] num = {1, 1, 1, 1, 1, 1, 1, 5, 6, 6, 6, 7, 8};
//        List<Integer> numbersList
//                = Arrays.asList(num);
//
//        Map<Integer, Long> elementCountMap = numbersList.stream()
//                .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
//
//        for(Map.Entry<Integer, Long> map : elementCountMap.entrySet()) {
//            if(map.getValue() > numbersList.size() / 2) {
//                System.out.println(map.getKey());
//            }
//        }

//        int sum = 0, revSum = 0;
//        List<Integer> a1 = new ArrayList<>();
//        a1.add(1);
//        a1.add(2);
//        a1.add(3);
//        List<Integer> a2 = new ArrayList<>();
//        a1.add(4);
//        a1.add(5);
//        a1.add(6);
//        List<Integer> a3 = new ArrayList<>();
//        a1.add(7);
//        a1.add(8);
//        a1.add(9);
//        List<List<Integer>> a = new ArrayList<>();
//        a.add(a1);
//        a.add(a2);
//        a.add(a3);
//        // 1 2 3
//        // 4 5 6
//        // 7 8 9
//        Integer[][] k = a.toArray(new Integer[10][10]);
//        for (List<Integer> i : a) {
//            for (int m = 0 ; m < i.size() ; m++) {
//                for (int n = 0 ; n < m ; n++) {
//                    if (i.indexOf(m) == i.indexOf(n)) {
//
//                    }
//                }
//            }
//        }
        int[] digits = {4,3,2,1};
        String sumString = "";
        for (int i : digits) {
            sumString += i;
        }
        int sum = Integer.parseInt(sumString);
        sum += 1;
        int[] newDigits = new int[digits.length + 1];
        while (sum > 0) {
            for (int i = newDigits.length - 1; i > 0 ; i--) {
                newDigits[i] = sum % 10;
            }
            sum /= 10;
        }
    }
}
