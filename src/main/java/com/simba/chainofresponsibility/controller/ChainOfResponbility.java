package com.simba.chainofresponsibility.controller;

import com.simba.chainofresponsibility.modle.AbstractLogger;
import com.simba.chainofresponsibility.modle.LoggerConsole;
import com.simba.chainofresponsibility.modle.LoggerError;
import com.simba.chainofresponsibility.modle.LoggerFile;

public class ChainOfResponbility {

  //创建一个责任链
  public static AbstractLogger getChainOfLogger(){
    AbstractLogger fileLogger = new LoggerFile(AbstractLogger.DEBUG);
    AbstractLogger errorLogger = new LoggerError(AbstractLogger.ERROR);
    AbstractLogger consoleLogger = new LoggerConsole(AbstractLogger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);

    return errorLogger;

  }

  public static void main(String[] args) {
    AbstractLogger loggerChain = getChainOfLogger();

    loggerChain.logMessage(AbstractLogger.INFO,"this is info need");
    loggerChain.logMessage(AbstractLogger.DEBUG,"this is debug need");
    loggerChain.logMessage(AbstractLogger.ERROR,"this is error need");

  }

}
