package com.league.leetcode.squares;

import java.util.Arrays;

/**
 * Created by coraline on 2019/3/6.
 */
public class Squares {
    public static int[] sortedSquares(int[] A) {

        int[] ret = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int temp = A[i] * A[i];
            ret[i] = temp;
        }
        Arrays.sort(ret);

        System.out.println(ret.toString());
        return ret;
    }

    public static void main(String[] args) {
        int[] A = new int[]{-7,-3,2,3,11};
        int[] arr = sortedSquares(A);
    }
}
