package com.jkxy.strategy.strategy.quackbehavior;

/**
 * Created by kerrui on 16/9/13.
 */
public class NoQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("~~~~NO Quack~~~~");
    }
}
