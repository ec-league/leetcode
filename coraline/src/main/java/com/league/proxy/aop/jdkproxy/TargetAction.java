package com.league.proxy.aop.jdkproxy;

/**
 * Created by coraline on 2019/6/5.
 */
public class TargetAction implements Action {

    @Override
    public void move() {
        System.out.println("target is moving~");
    }
}
