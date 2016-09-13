package com.jkxy.strategy.order.light;

import com.jkxy.strategy.order.modeContorl.Command;

/**
 * Created by kerrui on 16/9/13.
 */
public class LightOffCommand implements Command {

    private Light mLight;

    public LightOffCommand(Light light) {
        this.mLight = light;
    }

    @Override
    public void execute() {
        mLight.off();
    }

    @Override
    public void undo() {
        mLight.on();
    }
}
