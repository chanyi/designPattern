package com.simba.mediator.model;

public abstract class Mediator {
  //注册
  public abstract void register(Colleague colleague);
  //转发
  public abstract void relay(Colleague colleague);
}
