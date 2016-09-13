package com.jkxy.strategy.strategy.util;

import com.jkxy.strategy.strategy.flybehavior.FlyBehavior;
import com.jkxy.strategy.strategy.quackbehavior.QuackBehavior;

/**
 * Created by kerrui on 16/9/13.
 */
public abstract class Duck {

    FlyBehavior mFly;
    QuackBehavior mQuack;

    public Duck() {
    }

    public void quack() {
        mQuack.quack();
    }

    public void fly() {
        mFly.fly();
    }

    public void swim() {
        System.out.println("~~~~im wim~~~~");
    }

    public abstract void display();

    public void setmFly(FlyBehavior mFly) {
        this.mFly = mFly;
    }

    public void setmQuack(QuackBehavior mQuack) {
        this.mQuack = mQuack;
    }
}
