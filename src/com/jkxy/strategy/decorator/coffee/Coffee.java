package com.jkxy.strategy.decorator.coffee;

import com.jkxy.strategy.decorator.util.Drink;

/**
 * Created by kerrui on 16/9/13.
 *
 * 创建一个咖啡的中间层 ,继承自Drink  返回自己的价格,
 * 以后需要添加行的咖啡,直接创建子类继承自Coffee
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
