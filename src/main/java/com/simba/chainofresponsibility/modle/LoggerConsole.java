package com.simba.chainofresponsibility.modle;

public class LoggerConsole  extends AbstractLogger{

  public LoggerConsole(int level){
    this.level = level;
  }
  @Override
  protected void write(String message) {
    System.out.println("Console::logger: "+message);
  }
}
