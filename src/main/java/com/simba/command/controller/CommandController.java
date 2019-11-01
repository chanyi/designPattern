package com.simba.command.controller;

import com.simba.command.model.CommandLightOff;
import com.simba.command.model.CommandLightOn;
import com.simba.command.model.Light;
import com.simba.command.model.RemoteControl;

public class CommandController {

  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();
    Light livingLight = new Light("living room");
    Light washLight = new Light("wash room");

    CommandLightOn livingLigthOn = new CommandLightOn(livingLight);
    CommandLightOff livingLigthOff = new CommandLightOff(livingLight);
    CommandLightOn washLigthOn = new CommandLightOn(washLight);
    CommandLightOff washLigthOff = new CommandLightOff(washLight);

    remoteControl.setCommand(0,livingLigthOn,livingLigthOff);
    remoteControl.setCommand(1,washLigthOn,washLigthOff);
    remoteControl.offButtonWasPushed(0);
    remoteControl.onButtonWasPushed(0);
    remoteControl.offButtonWasPushed(1);
    remoteControl.onButtonWasPushed(1);
  }

}
