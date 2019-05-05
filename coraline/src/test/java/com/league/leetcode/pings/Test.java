package com.league.leetcode.pings;

/**
 * Created by coraline on 2019/4/25.
 */
public class Test {
    @org.junit.Test
    public void testPing() {
        RecentCounter obj = new RecentCounter();
        int[] arr = {1, 100, 3001, 3002};
        for (int i = 0; i < arr.length; i++) {
            int param_1 = obj.ping(arr[i]);
            System.out.println(param_1);
        }

    }
}
