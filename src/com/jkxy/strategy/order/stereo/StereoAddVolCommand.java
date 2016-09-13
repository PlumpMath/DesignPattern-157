package com.jkxy.strategy.order.stereo;

import com.jkxy.strategy.order.modeContorl.Command;

/**
 * Created by kerrui on 16/9/13.
 */
public class StereoAddVolCommand implements Command {

    private Stereo mStereo;

    public StereoAddVolCommand(Stereo stereo) {
        mStereo = stereo;
    }

    @Override
    public void execute() {
        int vol = mStereo.getVol();

        if (vol < 11) {
            mStereo.setVol(++vol);
        }
    }

    @Override
    public void undo() {
        int vol = mStereo.getVol();

        if (vol > 0) {
            mStereo.setVol(--vol);
        }
    }
}
