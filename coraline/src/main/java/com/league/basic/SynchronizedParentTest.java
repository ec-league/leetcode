package com.league.basic;

/**
 * Created by coraline on 2019/5/14.
 */
public class SynchronizedParentTest extends SuperSynchronizedParentTest {

    public static void main(String[] args) {
        SynchronizedParentTest child = new SynchronizedParentTest();

        child.doSomething();
    }

    @Override
    public synchronized void doSomething() {
        System.out.println("child.doSomething()" + Thread.currentThread().getName());
        doAnotherThing(); // 调用自己类中其他的synchronized方法
    }

    private synchronized void doAnotherThing() {
        super.doSomething(); // 调用父类的synchronized方法
        System.out.println("child.doAnotherThing()" + Thread.currentThread().getName());
    }

}

class SuperSynchronizedParentTest {
    public synchronized void doSomething() {
        System.out.println("father.doSomething()" + Thread.currentThread().getName());
    }
}

