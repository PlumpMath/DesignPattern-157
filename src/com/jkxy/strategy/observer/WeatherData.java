package com.jkxy.strategy.observer;

import java.util.Observable;

/**
 * Created by kerrui on 16/9/13.
 * <p>
 * 此类继承了java 系统的观察者的类
 *   java内置的观察者类是一个类,所以WeatherData不能实现多继承(java是不能多继承的)
 *   而自定义的 subject 是一个接口 就可以实现多接口
 */
public class WeatherData extends Observable {

    private float temperature;
    private float pressure;
    private float humidity;

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        /**
         *  this.setChanged();
         *   此方法一定要先实现 表示数据是有更新,有变化的
         *   可以自主设置一个变化通知的限度  比如温度变化超过5度才通知
         */
        this.setChanged();
        //this.notifyObservers();//此方法是   被通知可根据通知的信息  自主应用
        this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));
    }

    //模拟气象台发布消息
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public class Data {

        public float temperature;
        public float pressure;
        public float humidity;

        public Data(float temperature, float pressure, float humidity) {
            this.temperature = temperature;
            this.pressure = pressure;
            this.humidity = humidity;
        }
    }

    /**
     *   以下是自主实现的Observer接口方法
     *
     *   自主实现 需要建立一个ArrayList  添加和移除observer
     *   dataChange时 实现 notifyObserver方法
     */
    //@Override
    //public void registerObserver(Observer observer) {
    //    mObservers.add(observer);
    //}
    //
    //@Override
    //public void removeObserver(Observer observer) {
    //    if (mObservers.contains(observer)) {
    //        mObservers.remove(observer);
    //    }
    //}
    //
    //@Override
    //public void notifyObserver() {
    //    for (int i = 0; i < mObservers.size(); i++) {
    //        mObservers.get(i).update(getTemperature(), getPressure(), getHumidity());
    //    }
    //}
}
