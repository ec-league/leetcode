package com.league.prototype;

/**
 * Created by coraline on 2019/5/11.
 */
public abstract class LookUp {

    public abstract PrototypeBean getPrototypeBean();

    public void callPrototype() {
        System.out.println(getPrototypeBean().toString());
        getPrototypeBean().print();
    }
}
