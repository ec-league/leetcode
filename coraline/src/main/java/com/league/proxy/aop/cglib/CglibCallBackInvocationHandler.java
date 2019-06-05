package com.league.proxy.aop.cglib;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by coraline on 2019/6/5.
 */
//作用类似InvocationHandlerAction
public class CglibCallBackInvocationHandler implements MethodInterceptor {

    private TargetAction targetAction;

    public CglibCallBackInvocationHandler(TargetAction targetAction){
        this.targetAction = targetAction;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("invoke to intercept");
        return method.invoke(targetAction, objects);
    }
}
