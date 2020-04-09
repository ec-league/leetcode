package com.league.leetcode.contest;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private class Cashier{
        private int customerNo = 1;
        private int customerLuckyNo = 0;
        private int customerDiscount = 0;

        private Map<Integer,Integer> priceMap = new HashMap<>();

        public Cashier(int n, int discount, int[] products, int[] prices) {
            for(int i = 0; i < products.length; i++){
                priceMap.put(products[i], prices[i]);
            }

            customerLuckyNo = n;
            customerDiscount = discount;
        }

        public double getBill(int[] product, int[] amount) {
            double amountCount = 0;
            for(int i = 0; i< product.length; i++){
                amountCount = priceMap.get(product[i]) * amount[i];
            }

            if(customerLuckyNo == customerNo){
                amountCount = amountCount - (customerDiscount * amountCount) / 100;
            }

            return amountCount;

        }
    }

    public void main(String[] args) {
        int[] products = {1,2,3,4,5,6,7};
        int[] prices = {100,200,300,400,300,200,100};
        Cashier obj = new Cashier(3, 50, products, prices);
        obj.getBill(new int[]{1,2},new int[]{1,2});                        // 返回 500.0, 账单金额为 = 1 * 100 + 2 * 200 = 500.
        obj.getBill(new int[]{3,7},new int[]{10,10});                      // 返回 4000.0
        obj.getBill(new int[]{1,2,3,4,5,6,7},new int[]{1,1,1,1,1,1,1});    // 返回 800.0 ，账单原本为 1600.0 ，但由于该顾客是第三位顾客，他将得到 50% 的折扣，所以实际金额为 1600 - 1600 * (50 / 100) = 800 。
        obj.getBill(new int[]{4},new int[]{10});                           // 返回 4000.0
        obj.getBill(new int[]{7,3},new int[]{10,10});                      // 返回 4000.0
        obj.getBill(new int[]{7,5,3,1,6,4,2},new int[]{10,10,10,9,9,9,7}); // 返回 7350.0 ，账单原本为 14700.0 ，但由于系统计数再次达到三，该顾客将得到 50% 的折扣，实际金额为 7350.0 。
        obj.getBill(new int[]{2,3,5},new int[]{5,3,2});                    // 返回 2500.0
    }



}
