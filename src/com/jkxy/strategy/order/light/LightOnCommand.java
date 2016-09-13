package com.jkxy.strategy.order.light;

import com.jkxy.strategy.order.modeContorl.Command;

/**
 * Created by kerrui on 16/9/13.
 */
public class LightOnCommand implements Command {

    private Light mLight;

    public LightOnCommand(Light light){
        this.mLight = light;
    }

    @Override
    public void execute() {
        mLight.on();
    }

    @Override
    public void undo() {
mLight.off();
    }
}
