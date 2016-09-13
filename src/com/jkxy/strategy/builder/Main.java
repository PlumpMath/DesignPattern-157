package com.jkxy.strategy.builder;

/**
 * Created by kerrui on 16/9/13.
 * <p>
 * builder模式   目的是在实例化该类时   可以明确的看到属性样式
 */
public class Main {

    public static void main(String[] args) {

        PersonBuilder.Builder mBuilder = new PersonBuilder.Builder();
        PersonBuilder mPersonBuilder = mBuilder
                .name("builder").age(88).height(1.87f).married(false).build();

        System.out.println("姓名:" + mPersonBuilder.getName()
                + "  年龄:" + mPersonBuilder.getAge()
                + "  身高:" + mPersonBuilder.getHeight()
                + "  已婚:" + mPersonBuilder.isMarried());
    }
}
