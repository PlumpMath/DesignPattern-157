package com.jkxy.strategy.MVP;

/**
 * Created by kerrui on 16/9/13.
 */
public class Main implements MainView {

    private static MainPresenter sMainPresenter;

    public static void main(String[] args) {

        Main mMain = new Main();
        mMain.initData();
        mMain.initTestData();
    }

    //输出正式数据
    private void initData() {
        sMainPresenter = new MainPresenter();
        sMainPresenter.addTaskListener(this);
        sMainPresenter.getString();
    }

    //输出测试数据
    private void initTestData() {
        sMainPresenter = new MainPresenter().test();
        sMainPresenter.addTaskListener(this);
        sMainPresenter.getString();
    }

    @Override
    public void onShowString(String json) {
        System.out.println(json);
    }
}
