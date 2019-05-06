package com.league.leetcode.stock;

/**
 * Created by coraline on 2019/5/6.
 */
public class StockSellingMoreTransactions {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                max += prices[i + 1] - prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        int max = maxProfit(prices);
        System.out.println(max);
    }
}
