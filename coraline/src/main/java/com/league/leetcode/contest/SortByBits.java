package com.league.leetcode.contest;

import java.util.*;

public class SortByBits {

    public static int[] sortByBits(int[] arr) {

//        int[] retArr = new int[];
//        Arrays.sort(arr);

//        for(int i = 0; i < arr.length; i++){
//            String x = Integer.toBinaryString(i);
//            int countOne = 0;
//            for (char item : x.toCharArray()) {
//                if (item == '1') {
//                    countOne++;
//                }
//            }
//            if(i == 0){
//                retArr[0] =
//            }
//        }



        int[] retArr = new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String x = Integer.toBinaryString(i);
            int countOne = 0;
            for (char item : x.toCharArray()) {
                if (item == '1') {
                    countOne++;
                }
            }
            map.put(arr[i], countOne);
        }

        Map<Integer, LinkedList<Integer>> countMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (null == countMap.get(item.getValue())) {
                LinkedList<Integer> linkedList = new LinkedList<>();
                linkedList.add(item.getKey());
                countMap.put(item.getValue(), linkedList);
            } else {
                LinkedList<Integer> linkedList = countMap.get(item.getValue());
                for(int i =0; i < linkedList.size(); i++){

                }
            }
        }


        LinkedList<Integer> list = new LinkedList();


        int maxCount = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            maxCount = maxCount < item.getValue() ? item.getValue() : maxCount;
            if (maxCount == Integer.MIN_VALUE) {
                list.add(item.getKey());
            }
            if (item.getValue() > maxCount) {
            }
        }

        return retArr;
    }


    public static void main(String[] args) {

        int[] arr1 = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        int[] ret1 = sortByBits(arr1);
        System.out.println(ret1);

        int[] arr2 = {};
        int[] ret2 = sortByBits(arr2);
        System.out.println(ret2);

    }
}
