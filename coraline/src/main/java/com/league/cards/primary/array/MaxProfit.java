package com.league.cards.primary.array;

/**
 * Created by coraline on 2020/3/27.
 */
public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int profit = 0;

        int buyPrice = 0;
        int sellPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if ((i > 0 ) && (prices[i] > prices[i - 1]) && (buyPrice != 0)) {
                sellPrice = prices[i];
            } else if ((i > 0 ) && prices[i - 1] < prices[i]) {
                buyPrice = prices[i];
            }
            if (buyPrice != 0 && sellPrice != 0) {
                profit += sellPrice - buyPrice;
                buyPrice = 0;
                sellPrice = 0;
            }

        }

        return profit;

    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);
        System.out.println(profit);

    }
}
