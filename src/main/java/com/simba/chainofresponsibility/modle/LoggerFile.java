package com.simba.chainofresponsibility.modle;

public class LoggerFile extends AbstractLogger{

  public LoggerFile(int level){
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("File::logger: "+message);
  }
}
