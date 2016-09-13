package com.jkxy.strategy.order.light;

/**
 * Created by kerrui on 16/9/13.
 */
public class Light {

    String loc = "";//灯的种类

    public Light(String loc) {
        this.loc = loc;
    }

    public void on() {
        System.out.println(loc + " On");
    }

    public void off() {
        System.out.println(loc + " Off");
    }
}
