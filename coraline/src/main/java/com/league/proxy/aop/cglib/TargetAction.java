package com.league.proxy.aop.cglib;

/**
 * Created by coraline on 2019/6/5.
 */
public class TargetAction {
    private String word = "default";

    public TargetAction() {
    }

    public TargetAction(String word) {
        this.word = word;
    }

    public void move() {
        System.out.println("target moves " + word);
    }
}
