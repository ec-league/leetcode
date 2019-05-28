package com.league.pigeon.spi;

/**
 * Created by coraline on 2019/5/24.
 */
public class Cat implements Shout {
    @Override
    public void shout() {
        System.out.println("Cat shouts.");
    }
}
