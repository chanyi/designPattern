package com.simba.visitor.controller;

import com.simba.visitor.model.ElementA;
import com.simba.visitor.model.ElementB;
import com.simba.visitor.model.ObjectStructure;
import com.simba.visitor.model.Visitor;
import com.simba.visitor.model.VisitorA;
import com.simba.visitor.model.VisitorB;

public class VisitorController {

  public static void main(String[] args) {
    ObjectStructure objectStructure = new ObjectStructure();
    objectStructure.add(new ElementA());
    objectStructure.add(new ElementB());
    objectStructure.accept(new VisitorA());
    objectStructure.accept(new VisitorB());

  }
}
