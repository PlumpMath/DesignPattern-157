package com.jkxy.strategy.order;

import com.jkxy.strategy.order.modeContorl.Command;

/**
 * Created by kerrui on 16/9/14.
 *
 *   定义一个宏命令  一个按钮打开所有的灯
 */
public class MarcoCommand implements Command {

    private Command[] mCommands;

    public MarcoCommand(Command[] commands) {
        mCommands = commands;
    }

    @Override
    public void execute() {

        for (int i = 0, len = mCommands.length; i < len; i++) {
            mCommands[i].execute();
        }
    }

    @Override
    public void undo() {

        for (int i = mCommands.length - 1; i >= 0; i--) {
            mCommands[i].undo();
        }
    }
}
