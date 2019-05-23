package com.league.leetcode.p910_sort;

/**
 * Created by coraline on 2019/5/21.
 */
public class QuickSort {

    public static int[] sortArray(int[] nums) {
        if (nums.length < 2) {
            return nums;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums;

    }

    public static void quickSort(int[] nums, int low, int high) {
        if(low >= high){
            return;
        }
        int i = low;
        int j = high;
        int currentNum = nums[low];
        int index = low;
        while (i < j) {
            while (i < j && (nums[j] >= currentNum)) {
                j--;
            }
            if (i < j) {
                int temp = nums[j];
                nums[j] = nums[index];
                nums[index] = temp;
                index = j;
            }
            while (i < j && (nums[i] <= currentNum)) {
                i++;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index = i;
            }
        }
        quickSort(nums, low, index - 1);
        quickSort(nums, index + 1, high);
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1};
        int[] arr = sortArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}
