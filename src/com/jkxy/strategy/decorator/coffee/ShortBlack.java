package com.jkxy.strategy.decorator.coffee;

/**
 * Created by kerrui on 16/9/13.
 *
 *   实体的咖啡种类  继承自咖啡
 *
 */
public class ShortBlack extends Coffee {

    public ShortBlack() {
        super.setDescription("ShortBlack咖啡");
        super.setPrice(6.0f);//价格是3.0
    }
}