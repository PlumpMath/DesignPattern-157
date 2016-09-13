package com.jkxy.strategy.single;

/**
 * Created by kerrui on 16/9/13.
 * <p>
 * 单例模式的两种方法
 */
public class Main {

    public static void main(String[] args) {

        //同步锁
        Singleton.getInstance().useSingleton();
        //内部类
        SingletonInner.getInstance().useSingletonInner();
    }
}
