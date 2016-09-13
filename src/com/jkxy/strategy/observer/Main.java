package com.jkxy.strategy.observer;

/**
 * Created by kerrui on 16/9/13.
 * <p>
 * 观察者模式  像是一个定奶的服务,  通知奶站登记用户地址,每天给你送奶  不需要的时候通知奶站  就取消的预定
 * Subject类  相当于奶站   登记注册、  通知 、 移除
 * Observer类  相当于用户    接收和输入
 * <p>
 * 观察者模式是对象之间多对一依赖的一种设计方案。被依赖的对象为subject  依赖的对象为observer subject通知observer
 */
public class Main {

    public static void main(String[] args) {

        Observer1 mObserver1 = new Observer1();
        Observer2 mObserver2 = new Observer2();
        WeatherData mWeatherData = new WeatherData();

        /**
         *   自定义观察者模式的 subject 和  observer  的实现
         */
        ////注册观察者
        //mWeatherData.registerObserver(mObserver1);
        //mWeatherData.registerObserver(mObserver2);
        //
        ////模拟气象台发布数据
        //mWeatherData.setData(30.0f, 150f, 40f);
        //
        ////模拟observer1  观察者1 取消注册
        //mWeatherData.removeObserver(mObserver1);
        //mWeatherData.setData(33f, 120f, 44f);

        /**
         *   通过java  内置的观察者模式的实现
         */
        //注册观察者
        //java 内置的观察者模式  是最后注册的观察者先通知  跟自定义 是正好相反的
        mWeatherData.addObserver(mObserver1);
        mWeatherData.addObserver(mObserver2);

        //模拟气象台发布数据
        mWeatherData.setData(30.0f, 150f, 40f);

        ////模拟observer1  观察者1 取消注册
        mWeatherData.deleteObserver(mObserver1);
        mWeatherData.setData(33f, 120f, 44f);
    }
}
