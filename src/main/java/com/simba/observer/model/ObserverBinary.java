package com.simba.observer.model;

public class ObserverBinary extends Observer {

  public ObserverBinary(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("二进制观察者模型更新：binary string:");
    System.out.println(Integer.toBinaryString(subject.getState()));
  }
}
