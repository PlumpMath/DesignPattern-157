package com.jkxy.strategy.decorator.coffee;

/**
 * Created by kerrui on 16/9/13.
 *
 *   实体的咖啡种类  继承自咖啡
 *
 */
public class Espresso extends Coffee {

    public Espresso() {
        super.setDescription("Espresso咖啡");
        super.setPrice(4.0f);//价格是4.0
    }
}