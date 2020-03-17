package com.league.leetcode.climbingstairs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by coraline on 2020/1/15.
 */
public class ClimbStairs {

    public static Map<Integer, Integer> map = new HashMap<>();

    public static int climbStairs(int n) {

        if (null != map.get(n)) {
            return map.get(n);
        }

        if (1 == n) {
            return 1;
        }

        if (2 == n) {
            return 2;
        }

        int ways = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, ways);
        return ways;
    }

    public static void main(String[] args) {
        int n = 44;
        int ways = climbStairs(n);
        System.out.println(ways);
    }
}
