package com.league.leetcode.flipimage;

/**
 * Created by coraline on 2019/3/6.
 */
public class Solution {

    public static int[][] flipAndInvertImage(int[][] A) {

        int[][] result = new int[A.length][];
        for (int i = 0; i < A.length; i++) {
            result[i] = invertArr(A[i]);
        }
        return result;
    }


    private static int[] invertArr(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[arr.length - i - 1] = 1 - arr[i];
        }
        return ret;

    }

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] ret = flipAndInvertImage(A);


    }
}
