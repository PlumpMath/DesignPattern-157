package com.jkxy.strategy.decorator.derorator;

import com.jkxy.strategy.decorator.util.Drink;

/**
 * Created by kerrui on 16/9/13.
 */
public class Soy extends Decorator {

    public Soy(Drink mDrink) {
        super(mDrink);
        super.setDescription("Soy");
        super.setPrice(5.0f);
    }
}
