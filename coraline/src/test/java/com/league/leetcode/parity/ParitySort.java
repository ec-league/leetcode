package com.league.leetcode.parity;

/**
 * Created by coraline on 2019/3/6.
 */
public class ParitySort {
    public static int[] sortArrayByParity(int[] A) {

        int[] parityArray = new int[A.length];
        int begin = 0;
        int end = A.length - 1;

        for (int i = 0; i < A.length; i++) {
            if (0 == A[i] % 2) {
                parityArray[begin] = A[i];
                begin++;
            } else {
                parityArray[end] = A[i];
                end--;
            }
        }
        return parityArray;
    }

    public static void main(String[] args) {
        int[] A = new int[]{3, 1, 2, 4};
        sortArrayByParity(A);
    }
}
