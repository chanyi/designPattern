package com.simba.mediator.model;

import java.util.ArrayList;
import java.util.List;

public class MediatorConcrete extends Mediator {

  protected List<Colleague> colleagueList = new ArrayList<>();

  @Override
  public void register(Colleague colleague) {
    if(!colleagueList.contains(colleague)){
      colleagueList.add(colleague);
      colleague.setMediator(this);
    }
  }

  @Override
  public void relay(Colleague colleague) {
    for (Colleague colleague1 : colleagueList){
      if(!colleague1.equals(colleague)){
        colleague1.receive();
      }
    }
  }
}
