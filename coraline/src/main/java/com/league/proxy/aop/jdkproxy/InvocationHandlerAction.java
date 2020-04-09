package com.league.proxy.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by coraline on 2019/6/5.
 */
public class InvocationHandlerAction implements InvocationHandler {

    private Action target;

    public InvocationHandlerAction(Action target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke yo!");
        return method.invoke(target, args);
    }
}
