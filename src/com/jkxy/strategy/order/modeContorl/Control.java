package com.jkxy.strategy.order.modeContorl;

/**
 * Created by kerrui on 16/9/13.
 */
public interface Control {

    void onButton(int slot);

    void offButton(int slot);

    void undoButton();
}
