package com.jkxy.strategy.observer;

import java.util.Observable;

/**
 * Created by kerrui on 16/9/13.
 */
public class Observer1 implements java.util.Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    public void display() {
        System.out.println("***today temperature = " + temperature + "***");
        System.out.println("***today pressure = " + pressure + "***");
        System.out.println("***today humidity = " + humidity + "***");
        System.out.println("----------------------------------------------------");
    }

    @Override
    public void update(Observable o, Object arg) {
        this.temperature = ((WeatherData.Data) (arg)).temperature;
        this.pressure = ((WeatherData.Data) (arg)).pressure;
        this.humidity = ((WeatherData.Data) (arg)).humidity;
        display();
    }

    //自定义实现 observer 接口的示例
    //public Observer1(float temperature, float pressure, float humidity) {
    //    this.temperature = temperature;
    //    this.pressure = pressure;
    //    this.humidity = humidity;
    //}
    //@Override
    //public void update(float temperature, float pressure, float humidity) {
    //
    //    this.temperature = temperature;
    //    this.pressure = pressure;
    //    this.humidity = humidity;
    //    display();
    //}
}
