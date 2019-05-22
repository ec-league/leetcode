package com.league.leetcode.p910_sort;

/**
 * Created by coraline on 2019/5/21.
 */
public class BubbleSort {
    public static int[] sortArray(int[] nums) {
        if (2 > nums.length) {
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }

            }
        }

        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int[] sortedArr = sortArray(nums);
        for(int i=0; i< sortedArr.length; i++){
            System.out.println(sortedArr[i]);
        }

    }
}
