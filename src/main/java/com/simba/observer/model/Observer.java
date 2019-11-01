package com.simba.observer.model;

public abstract class Observer {

  protected Subject subject;
  public abstract void update();
}
