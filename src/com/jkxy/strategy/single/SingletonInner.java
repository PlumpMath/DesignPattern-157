package com.jkxy.strategy.single;

/**
 * Created by kerrui on 16/9/13.
 */
public class SingletonInner {

    private static class SingletonHolder {
        private static SingletonInner instance = new SingletonInner();
    }

    private SingletonInner() {
    }

    public static SingletonInner getInstance() {
        return SingletonHolder.instance;
    }

    public void useSingletonInner() {
        System.out.println("这是内部类实现的单例模式");
    }
}
