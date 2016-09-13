package com.jkxy.strategy.decorator;

import com.jkxy.strategy.decorator.coffee.Decaf;
import com.jkxy.strategy.decorator.coffee.LongBlack;
import com.jkxy.strategy.decorator.derorator.Chocolate;
import com.jkxy.strategy.decorator.derorator.Milk;
import com.jkxy.strategy.decorator.util.Drink;

/**
 * Created by kerrui on 16/9/13.
 * <p>
 * <p>
 * /**
 * 装饰者模式，就像是打包一个快递
 * 1） 主体：例如  陶瓷  衣服
 * 2） 包装： 例如 报纸填充，泡沫填充，纸板，木板
 * <p/>
 * Component （主体）：
 * <p/>
 * concreteComponent（具体组成） 和 Decorator（装饰者）
 * <p/>
 * 装饰者模式：动态的将新功能附加到对象（主体）上，(在此示例中就是把材料,牛奶、巧克力等,添加到单瓶咖啡上)
 * <p>
 * 此示例描述的是购买咖啡时 需要添加的材料  并算出所有的花销
 */
public class Main {

    private static Drink mDrink;

    public static void main(String[] args) {

        mDrink = new Decaf();//只点了一杯Decaf 咖啡
        System.out.println("order1 desc :" + mDrink.getDescription());
        System.out.println("order1 price :" + mDrink.cost());

        System.out.println("——------------------------");

        mDrink = new LongBlack();
        mDrink = new Milk(mDrink);
        mDrink = new Chocolate(mDrink);
        mDrink = new Chocolate(mDrink);
        System.out.println("order2 desc: " + mDrink.getDescription());
        System.out.println("order2 price: " + mDrink.cost());
    }
}
