package com.league.proxy.aop.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * Created by coraline on 2019/6/5.
 */
public class CglibGenerator {
    public static <T> T create(Class<T> clazz, MethodInterceptor methodInterceptor) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(methodInterceptor);
        return (T) enhancer.create();

    }
}
