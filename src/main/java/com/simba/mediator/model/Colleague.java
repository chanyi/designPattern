package com.simba.mediator.model;

public abstract class Colleague {

  protected Mediator mediator;

  public Mediator getMediator() {
    return mediator;
  }

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public abstract void receive();
  public abstract void send();
}
