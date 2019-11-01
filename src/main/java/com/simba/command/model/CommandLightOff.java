package com.simba.command.model;

public class CommandLightOff implements Command {

  private Light light;

  public CommandLightOff(Light light){
    this.light = light;
  }
  @Override
  public void execute() {
    this.light.off();
  }

}

