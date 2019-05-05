package com.league.leetcode.mountainarray;

import org.junit.Test;

/**
 * Created by coraline on 2019/3/28.
 */
public class MountainArray {

    public int peakIndexInMountainArray(int[] A) {

        int max = A[0];
        int maxIndex = 0;
        for (int i = 1; i < A.length; i++) {

            if (A[i] > max) {
                max = A[i];
                maxIndex = i;
            } else {
                break;
            }
        }
        return maxIndex;
    }

    @Test
    public void peak() {
        int[] A = new int[]{0,1,0};
        int index = peakIndexInMountainArray(A);
        System.out.println(index);
    }
}
