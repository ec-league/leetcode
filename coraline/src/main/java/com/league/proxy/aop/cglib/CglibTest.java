package com.league.proxy.aop.cglib;

/**
 * Created by coraline on 2019/6/5.
 */
public class CglibTest {

    public static void main(String[] args) {
        TargetAction targetAction = new TargetAction();
        TargetAction proxy = CglibGenerator.create(TargetAction.class, new CglibCallBackInvocationHandler(targetAction));
        proxy.move();
    }
}
