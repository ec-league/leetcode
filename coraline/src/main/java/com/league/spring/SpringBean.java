package com.league.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by coraline on 2019/5/10.
 */
//@Scope("prototype")
@Component
public class SpringBean implements InitializingBean,DisposableBean{
    @PostConstruct
    public void construct() {
        System.out.println("post construct");
    }

    @PreDestroy
    public void destroy555() {
        System.out.println("destroy");
    }

    public void tt(){
        System.out.println("test test test");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void destroy() throws Exception {

    }
}

