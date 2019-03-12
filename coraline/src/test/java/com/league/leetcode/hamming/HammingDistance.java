package com.league.leetcode.hamming;

/**
 * Created by coraline on 2019/3/11.
 */
public class HammingDistance {

    public static int hammingDistance(int x, int y) {

        int count = 0;
        int loop = 0;
        int temp = 0;
        int z = x ^ y;
        while (temp < Math.pow(2, 32)) {
            temp = (int) Math.pow(2, loop) * z;
            if(temp == 1){
                count++;
            }
        }
        loop++;
        return count;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        int distance = hammingDistance(x, y);
        System.out.println(distance);
    }
}
