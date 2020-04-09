package com.league.ebay;

public class Cal {

    public static double myPow(int x, int n) {
        if(n==0){
            return 1;
        }
        double res=1;
        for(int i=n;i!=0;i=i/2){
            if(i%2!=0){
                res*=x;
            }
            x*=x;
        }
        return n<0?1/res:res;
    }

    public static void main(String[] args) {
        System.out.println(myPow(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }
}
