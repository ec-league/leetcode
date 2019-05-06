package com.league.leetcode.stock;

/**
 * Created by coraline on 2019/5/6.
 */
public class StockSellingMaxMinusMin {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = prices[i] - minPrice > maxProfit ? prices[i] - minPrice : maxProfit;
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2};
        int max = maxProfit(prices);
        System.out.println(max);
    }
}
