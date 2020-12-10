package com.league.LOCF;

/**
 * Created by coraline on 2020/12/9.
 */
public class Fib {

    public static int fib(int n) {

        int sum = 0;
        int a = 0;
        int b = 1;
        if(0 == n || 1 == n){
            return n;
        }
        for (int i = 2; i < n; i++) {
            sum = a + b;
            sum = sum % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.println(result);
    }
}
