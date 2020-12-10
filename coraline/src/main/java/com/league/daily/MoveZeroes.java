package com.league.daily;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coraline on 2020/11/19.
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        List nonZeroNumsIndexList = new ArrayList<Integer>();


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                continue;
            } else {
                for(int j = i; j + 1 < nums.length; j++){
                    nums[j] = nums[j + 1];
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
