package com.simba.chainofresponsibility.modle;

public class LoggerError extends AbstractLogger{

  public LoggerError(int level){
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Error::logger: "+message);
  }
}
