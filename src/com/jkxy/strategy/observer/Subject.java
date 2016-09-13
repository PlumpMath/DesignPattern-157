package com.jkxy.strategy.observer;

/**
 * Created by kerrui on 16/9/13.
 *
 * 自定义 的
 */
public interface Subject {

    //注册观察者
    void registerObserver(Observer observer);

    //移除
    void removeObserver(Observer observer);

    //通知
    void notifyObserver();
}
