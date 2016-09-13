package com.jkxy.strategy.strategy.util;

import com.jkxy.strategy.strategy.flybehavior.BadFlyBehavior;
import com.jkxy.strategy.strategy.quackbehavior.GaGaQuack;

/**
 * Created by kerrui on 16/9/13.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        mFly = new BadFlyBehavior();
        mQuack = new GaGaQuack();
    }

    @Override
    public void display() {
        System.out.println("**Red Head Duck**");
    }
}
