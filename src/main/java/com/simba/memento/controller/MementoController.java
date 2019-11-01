package com.simba.memento.controller;

import com.simba.memento.model.Caretaker;
import com.simba.memento.model.Originator;

public class MementoController {

  public static void main(String[] args) {
    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();
    originator.setState("s1");
    System.out.println("初始化状态为："+originator.getState());
    //创建备份
    caretaker.setMemento(originator.createMemento());
    originator.setState("s2");
    System.out.println("新的状态为："+originator.getState());
    //回复状态
    originator.restoreMemento(caretaker.getMemento());
    System.out.println("回复后的状态为："+originator.getState());
  }
}
