package com.jkxy.strategy.order.stereo;

import com.jkxy.strategy.order.modeContorl.Command;

/**
 * Created by kerrui on 16/9/13.
 */
public class StereoOnCommand implements Command {

    private Stereo mStereo;

    public StereoOnCommand(Stereo stereo) {
        mStereo = stereo;
    }

    @Override
    public void execute() {

        mStereo.on();
        mStereo.setCd();
    }

    @Override
    public void undo() {
mStereo.off();
    }
}
