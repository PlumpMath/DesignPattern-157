package com.jkxy.strategy.decorator.derorator;

import com.jkxy.strategy.decorator.util.Drink;

/**
 * Created by kerrui on 16/9/13.
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink mDrink) {
        super(mDrink);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
