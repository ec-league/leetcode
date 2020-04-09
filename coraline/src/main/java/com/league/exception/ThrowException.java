package com.league.exception;

/**
 * Created by coraline on 2019/6/6.
 */
public class ThrowException {

    public static void main(String[] args) {
        Integer x1 = new Integer(64);
        Integer x2 = new Integer(64);
        if(x1 == x2){
            System.out.println("equals yo ~~~");
        }



//        try {
//            System.out.println("start");
//            throw new RuntimeException("excpetion happens");
//
//        } catch (Exception ex) {
//            System.out.println("catch");
//        } finally {
//            System.out.println("finally");
//        }
    }
}
