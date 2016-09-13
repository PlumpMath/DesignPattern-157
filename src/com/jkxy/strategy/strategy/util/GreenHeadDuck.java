package com.jkxy.strategy.strategy.util;

import com.jkxy.strategy.strategy.flybehavior.GoodFlyBehavior;
import com.jkxy.strategy.strategy.quackbehavior.GaGaQuack;

/**
 * Created by kerrui on 16/9/13.
 */
public class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        mFly = new GoodFlyBehavior();
        mQuack = new GaGaQuack();
    }

    @Override
    public void display() {
        System.out.println("**Green Head Duck**");
    }
}
