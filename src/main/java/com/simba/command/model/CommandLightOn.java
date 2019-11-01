package com.simba.command.model;

public class CommandLightOn implements Command {

  private Light light;

  public CommandLightOn(Light light){
    this.light = light;
  }
  @Override
  public void execute() {
    this.light.on();
  }

}
