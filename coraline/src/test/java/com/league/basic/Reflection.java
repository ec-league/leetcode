package com.league.basic;

/**
 * Created by coraline on 2019/5/13.
 */
public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> className = Class.forName(Reflection.class.getName());
        System.out.println(className.newInstance().toString());

    }
}
