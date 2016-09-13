package com.jkxy.strategy.decorator.derorator;

import com.jkxy.strategy.decorator.util.Drink;

/**
 * Created by kerrui on 16/9/13.
 * <p>
 * 此类是装饰者类  所以需要一个装饰的对象Drink
 */
public class Decorator extends Drink {

    private Drink mDrink;

    public Decorator(Drink mDrink) {
        this.mDrink = mDrink;
    }

    @Override
    public float cost() {
        //返回的是自己的价格  再加上被装饰者的价格
        return super.getPrice() + mDrink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " && " + mDrink.getDescription();
    }
}
