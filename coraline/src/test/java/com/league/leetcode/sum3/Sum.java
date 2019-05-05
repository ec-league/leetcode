package com.league.leetcode.sum3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by coraline on 2019/4/25.
 */
public class Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        //sort the array
        sort(nums);
        //double points
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = getNumsList(nums, i);
            if (null == list || 0 == list.size()) {
                continue;
            }
            if (null != ret && 0 != ret.size()) {
                for (int j = 0; j < ret.size(); j++) {
                    if (list.retainAll(ret.get(j))) {
                        ret.add(list);
                        break;
                    }
                }
            } else {
                ret.add(list);
            }
        }
        return ret;
    }

    private static List<Integer> getNumsList(int[] nums, int i) {
        int low = 0;
        int high = nums.length - 1;
        List<Integer> ret = new ArrayList<>();
        while (low < high) {
            int count = nums[low] + nums[high] + nums[i];
            if (count > 0 || i == high) {
                high--;
            } else if (count < 0 || i == low) {
                low++;
            } else {
                ret.add(nums[low]);
                ret.add(nums[high]);
                ret.add(nums[i]);
                break;
            }
        }

        return ret;
    }

    private static int[] sort(int[] nums) {
        if (null == nums || 2 > nums.length) {
            return nums;
        }
        int low = 0;
        int high = nums.length - 1;
        quickSort(nums, low, high);
        return nums;

    }

    private static void quickSort(int[] nums, int low, int high) {
        int current = low;
        int currentNum = nums[current];

        if (low >= high) {
            return;
        }
        int i = low;
        int j = high;
        while (i < j) {
            while (i < j && nums[j] >= currentNum) {
                j--;
            }

            if (i < j) {
                int temp = nums[j];
                nums[j] = currentNum;
                nums[i] = temp;
                current = j;
            }
            while (i < j && nums[i] <= currentNum) {
                i++;
            }
            if (i < j) {
                int temp = nums[i];
                nums[i] = currentNum;
                nums[j] = temp;
                current = i;
            }
        }

        quickSort(nums, low, current);
        quickSort(nums, current + 1, high);
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list.toString());
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        int[] sortedNums = sort(nums);
//        for (int i = 0; i < sortedNums.length; i++) {
//            System.out.println(sortedNums[i]);
//        }

    }
}
