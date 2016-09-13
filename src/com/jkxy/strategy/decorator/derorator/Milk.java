package com.jkxy.strategy.decorator.derorator;

import com.jkxy.strategy.decorator.util.Drink;

/**
 * Created by kerrui on 16/9/13.
 */
public class Milk extends Decorator {

    public Milk(Drink mDrink) {
        super(mDrink);
        super.setDescription("Milk");
        super.setPrice(4.0f);
    }
}
