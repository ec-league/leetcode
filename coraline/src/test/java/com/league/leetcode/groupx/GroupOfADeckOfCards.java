package com.league.leetcode.groupx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GroupOfADeckOfCards {

    public static boolean hasGroupsSizeX(int[] deck) {

        int len = deck.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < deck.length; i++) {
            if (null == map.get(deck[i])) {
                map.put(deck[i], 1);
            } else {
                int count = map.get(deck[i]);
                count++;
                map.put(deck[i], count);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        int minCount = Integer.MAX_VALUE;
        for (Integer item : map.values()) {
            Integer value = item;
            minCount = value < minCount ? value : minCount;
        }

        if (minCount <= 1) {
            return false;
        }

        for(Integer item : map.values()){
            if(0 == item % minCount){
                continue;
            }else{
                return false;
            }
        }

        return false;
    }

    public static void main(String[] args) {

//        int[] arr1 = {1, 1, 1, 2, 2, 2, 3, 3};
//        boolean ret1 = hasGroupsSizeX(arr1);
//        System.out.println(ret1);

        int[] arr2 = {1, 1, 2, 2, 2, 2};
        boolean ret2 = hasGroupsSizeX(arr2);
        System.out.println(ret2);
    }

}
