package com.league.lock;

/**
 * Created by coraline on 2019/5/14.
 */
public class SynchronizedTest {

    public static void main(String[] args) {
        new SynchronizedTest().getInt(1);
    }

    public synchronized void getInt(int i) {
        i++;
        System.out.println(i);
        System.out.println("balalalal~~~~");

    }

    public String getString() {
        synchronized (this) {
            return "";
        }
    }

    public String getClassString() {
        synchronized (SynchronizedTest.class) {
            return "";
        }

    }
}
