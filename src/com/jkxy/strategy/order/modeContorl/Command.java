package com.jkxy.strategy.order.modeContorl;

/**
 * Created by kerrui on 16/9/13.
 */
public interface Command {

    void execute();

    void undo();
}
