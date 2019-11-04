package com.simba.chainofresponsibility.modle;

public abstract class AbstractLogger {
  //具有不同的日志级别
  public static int INFO = 1;
  public static int DEBUG = 2;
  public static int ERROR = 3;

  protected int level;

  //责任链中的下一个元素
  protected AbstractLogger nextLogger;

  public void setNextLogger(AbstractLogger nextLogger) {
    this.nextLogger = nextLogger;
  }

  public void logMessage(int level,String message){
    if(this.level<=level){
      write(message);
    }
    if(nextLogger != null){
      nextLogger.logMessage(level,message);
    }
  }

  abstract protected  void write(String message);
}
