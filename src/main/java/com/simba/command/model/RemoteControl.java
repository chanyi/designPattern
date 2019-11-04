package com.simba.command.model;

public class RemoteControl {
  public Command[] onCommands;
  public Command[] offCommands;

  public RemoteControl(){
    onCommands = new Command[5];
    offCommands = new Command[5];
  }

  public void  setCommand(int solt,Command onCommand,Command offCommand){
    onCommands[solt] = onCommand;
    offCommands[solt] = offCommand;

  }
  public void onButtonWasPushed(int solt){
    onCommands[solt].execute();
  }

  public void offButtonWasPushed(int solt){
    offCommands[solt].execute();
  }



}
