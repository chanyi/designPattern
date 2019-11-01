package com.simba.mediator.model;

public class ColleagueConcrete1 extends Colleague {

  @Override
  public void receive() {
    System.out.println("同事1收到请求");
  }

  @Override
  public void send() {
    System.out.println("同事1发出消息");
    mediator.relay(this);
  }
}
