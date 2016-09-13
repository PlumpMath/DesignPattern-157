package com.jkxy.strategy.strategy.flybehavior;

/**
 * Created by kerrui on 16/9/13.
 */
public class GoodFlyBehavior implements FlyBehavior {

    /**
     *   具体实现行为接口
     */
    @Override
    public void fly() {
        System.out.println("~~~~Good Fly~~~~");
    }
}
