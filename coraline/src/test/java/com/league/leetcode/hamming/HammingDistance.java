package com.league.leetcode.hamming;

/**
 * Created by coraline on 2019/3/11.
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {

        int count = 0;
        int temp = 0;
        int z = x ^ y;
        for (int loop = 0; loop < 31; loop++) {
            int self = (int) Math.pow(2, loop);
            temp = self & z;
            if (temp == self) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 0;
        int y = 2147483647;
        int distance = hammingDistance(x, y);
        System.out.println(distance);
    }
}
