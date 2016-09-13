package com.jkxy.strategy.single;

/**
 * Created by kerrui on 16/9/13.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void useSingleton() {
        System.out.println("这是同步锁实现的单例模式");
    }
}
