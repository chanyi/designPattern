package com.simba.mediator.model;

public class ColleagueConcrete2 extends Colleague {

  @Override
  public void receive() {
    System.out.println("同事2收到请求");
  }

  @Override
  public void send() {
    System.out.println("同事2发出消息");
    mediator.relay(this);
  }
}
