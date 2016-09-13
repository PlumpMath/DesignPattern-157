package com.jkxy.strategy.order.stereo;

import com.jkxy.strategy.order.modeContorl.Command;

/**
 * Created by kerrui on 16/9/13.
 */
public class StereoOffCommand implements Command {

    private Stereo mStereo;

    public StereoOffCommand(Stereo stereo) {
        mStereo = stereo;
    }

    @Override
    public void execute() {

        mStereo.off();
    }

    @Override
    public void undo() {
        mStereo.on();
        mStereo.setCd();
    }
}
