package com.jkxy.strategy.order;

import com.jkxy.strategy.order.light.Light;
import com.jkxy.strategy.order.light.LightOffCommand;
import com.jkxy.strategy.order.light.LightOnCommand;
import com.jkxy.strategy.order.modeContorl.Command;
import com.jkxy.strategy.order.modeContorl.CommandModeControl;
import com.jkxy.strategy.order.stereo.*;

/**
 * Created by kerrui on 16/9/13.
 * <p>
 * 命令模式: 将请求、命令、动作等封装成对象,z这样可以让项目使用z这些对象来参数化其他对象。
 * 使得命令的请求着和命令者解耦
 */
public class Main {

    public static void main(String[] args) {

        CommandModeControl mModeControl = new CommandModeControl();
        Light bedroomLight = new Light("bedroom");
        Light kitchenLight = new Light("Kitchen");
        Stereo mStereo = new Stereo();

        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        Command[] onCommand = {bedroomLightOn, kitchenLightOn};
        Command[] offCommand = {bedroomLightOff, kitchenLightOff};
        MarcoCommand onMarco = new MarcoCommand(onCommand);
        MarcoCommand offMarco = new MarcoCommand(offCommand);

        StereoOnCommand stereoOn = new StereoOnCommand(mStereo);
        StereoOffCommand stereoOff = new StereoOffCommand(mStereo);
        StereoAddVolCommand stereoAddVol = new StereoAddVolCommand(mStereo);
        StereoSubVolCommand stereoSubVol = new StereoSubVolCommand(mStereo);

        mModeControl.setCommand(0, bedroomLightOn, bedroomLightOff);
        mModeControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        mModeControl.setCommand(2, stereoOn, stereoOff);
        mModeControl.setCommand(3, stereoAddVol, stereoSubVol);
        mModeControl.setCommand(4, onMarco, offMarco);

        mModeControl.onButton(0);
        mModeControl.undoButton();
        //mModeControl.offButton(0);

        mModeControl.onButton(1);
        mModeControl.offButton(1);

        mModeControl.onButton(2);
        mModeControl.onButton(3);
        mModeControl.onButton(3);
        mModeControl.onButton(3);
        mModeControl.onButton(3);
        mModeControl.undoButton();

        mModeControl.offButton(3);
        mModeControl.offButton(2);

        mModeControl.onButton(4);
        mModeControl.offButton(4);
    }
}
