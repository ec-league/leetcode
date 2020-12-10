package com.league.daily;

/**
 * Created by coraline on 2020/11/18.
 */
public class CanCompleteCircuit {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int tank = gas[i] - cost[i];
            if (tank < 0) {
                continue;
            } else {
                int j;
                if (i == gas.length - 1) {
                    j = 0;
                } else {
                    j = i + 1;
                }
                int oneLoop = 0;
                for (; j != i; ) {
                    tank = tank + gas[j] - cost[j];
                    if (tank < 0) {
                        oneLoop = -1;
                        break;
                    }
                    if (j == gas.length - 1) {
                        j = 0;
                    } else {
                        j++;
                    }
                }
                if (oneLoop == 0) {
                    return i;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        int startIndex = canCompleteCircuit(gas, cost);
        System.out.println(startIndex);
    }
}
