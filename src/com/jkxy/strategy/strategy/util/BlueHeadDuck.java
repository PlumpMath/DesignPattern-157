package com.jkxy.strategy.strategy.util;

import com.jkxy.strategy.strategy.flybehavior.NoFlyBehavior;
import com.jkxy.strategy.strategy.quackbehavior.NoQuack;

/**
 * Created by kerrui on 16/9/13.
 */
public class BlueHeadDuck extends Duck {

    public BlueHeadDuck() {
        mFly = new NoFlyBehavior();
        mQuack = new NoQuack();
    }

    @Override
    public void display() {
        System.out.println("**Blue Head Duck**");
    }
}
