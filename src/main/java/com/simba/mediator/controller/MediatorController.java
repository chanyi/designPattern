package com.simba.mediator.controller;

import com.simba.mediator.model.Colleague;
import com.simba.mediator.model.ColleagueConcrete1;
import com.simba.mediator.model.ColleagueConcrete2;
import com.simba.mediator.model.Mediator;
import com.simba.mediator.model.MediatorConcrete;

public class MediatorController {

  public static void main(String[] args) {
    Mediator mediator = new MediatorConcrete();
    Colleague colleague1 = new ColleagueConcrete1();
    Colleague colleague2 = new ColleagueConcrete2();
    mediator.register(colleague1);
    mediator.register(colleague2);
    //同事类1给中介发送，中介遍历所有类，然后将同事类1的消息转发给其他同事
    colleague1.send();

    System.out.println("-----------------");
    colleague2.send();
  }

}
