package com.jkxy.strategy.observer;

import java.util.*;

/**
 * Created by kerrui on 16/9/13.
 */
public class Observer2 implements java.util.Observer {

    private float temperature;
    private float pressure;
    private float humidity;

    public void display() {
        System.out.println("***温度today temperature = " + temperature + "***");
        System.out.println("***气压today pressure = " + pressure + "***");
        System.out.println("***湿度today humidity = " + humidity + "***");
        System.out.println("----------------------------------------------------");
    }

    @Override
    public void update(Observable o, Object arg) {

        this.temperature = ((WeatherData.Data) (arg)).temperature;
        this.pressure = ((WeatherData.Data) (arg)).pressure;
        this.humidity = ((WeatherData.Data) (arg)).humidity;
        display();
    }
    //@Override
    //public void update(float temperature, float pressure, float humidity) {
    //
    //    this.temperature = temperature;
    //    this.pressure = pressure;
    //    this.humidity = humidity;
    //    display();
    //}
}
