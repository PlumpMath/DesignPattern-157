package com.jkxy.strategy.order.modeContorl;

import com.jkxy.strategy.order.light.NoCommand;

import java.util.Stack;

/**
 * Created by kerrui on 16/9/13.
 * <p>
 * 遥控器
 */
public class CommandModeControl implements Control {

    private Command[] mOnCommand;
    private Command[] mOffCommand;
    private Stack<Command> mStack = new Stack<>();

    public CommandModeControl() {
        mOnCommand = new Command[5];
        mOffCommand = new Command[5];

        Command noCommand = new NoCommand();
        for (int i = 0, len = mOnCommand.length; i < len; i++) {
            mOnCommand[i] = noCommand;
            mOffCommand[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        mOnCommand[slot] = onCommand;
        mOffCommand[slot] = offCommand;
    }

    @Override
    public void onButton(int slot) {

        mOnCommand[slot].execute();
        mStack.push(mOnCommand[slot]);
    }

    @Override
    public void offButton(int slot) {

        mOffCommand[slot].execute();
        mStack.push(mOffCommand[slot]);
    }

    @Override
    public void undoButton() {
        mStack.pop().undo();
    }
}
