package com.league.prototype;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by coraline on 2019/5/10.
 */
//prototype作用域的bean的销毁阶段的方法不会执行
//prototype的销毁就跟普通的java对象是一样的，会通过gc来回收
@Scope("prototype")
@Component
public class PrototypeBean implements InitializingBean,DisposableBean{
    @PostConstruct
    public void construct() {
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void destroy555() {
        System.out.println("PreDestroy");
    }

    public void print(){
        System.out.println("test test test");
    }

    //在bean初始化之后，可以用过接口、注解、xml属性配置的方法来做一些额外的操作
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}

