package com.league.leetcode.nrepeated;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by coraline on 2019/3/6.
 */
public class NRepeatedNumber {

    public static int repeatedNTimes(int[] A) {

        Map map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (map.containsKey(A[i])) {
                return A[i];
            } else {
                map.put(A[i], 1);

            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] A = new int[]{5,1,5,2,5,3,5,4};
        int ret = repeatedNTimes(A);
        System.out.println(ret);
    }
}
