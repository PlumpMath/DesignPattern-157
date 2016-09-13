package com.jkxy.strategy.strategy;

import com.jkxy.strategy.strategy.flybehavior.NoFlyBehavior;
import com.jkxy.strategy.strategy.quackbehavior.NoQuack;
import com.jkxy.strategy.strategy.util.BlueHeadDuck;
import com.jkxy.strategy.strategy.util.Duck;
import com.jkxy.strategy.strategy.util.GreenHeadDuck;
import com.jkxy.strategy.strategy.util.RedHeadDuck;

/**
 * Created by kerrui on 16/9/13.
 * <p>
 * 策略模式
 * <p>
 * 分析项目变化与不变化部分,提取变化部分,抽象成接口 + 实现  比如此例子 鸭子的是否会飞  和  叫声是变化部分
 * <p>
 * 策略模式
 * 分别封装行为接口,实现算法族,超类里放行为接口对象,在子类里具体设定行为对象,
 * 原则就是:分离变化部分,封装接口,基于接口编程各种功能,
 */
public class Main {

    public static void main(String[] args) {

        //这里实例化超类 也就是父类。目的是直接实现父类的方法,而子类的方法不去理会
        Duck mGreen = new GreenHeadDuck();
        Duck mRed = new RedHeadDuck();
        Duck mBlue = new BlueHeadDuck();

        mGreen.display();
        mGreen.swim();
        mGreen.quack();
        mGreen.fly();
        System.out.println("---------------------------");

        mRed.display();
        mRed.swim();
        mRed.quack();
        mRed.fly();
        System.out.println("---------------------------");

        mBlue.display();
        mBlue.swim();
        mBlue.quack();
        mBlue.fly();
        System.out.println("---------------------------");

        //在此处演示的是改变其行为状态
        mGreen.display();
        System.out.println("改变绿头鸭的行为状态");
        mGreen.setmFly(new NoFlyBehavior());
        mGreen.fly();
        mGreen.setmQuack(new NoQuack());
        mGreen.quack();
    }
}
