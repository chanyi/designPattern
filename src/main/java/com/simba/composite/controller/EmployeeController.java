package com.simba.composite.controller;

import com.simba.composite.model.Employee;
import java.util.ArrayList;

public class EmployeeController {

  public static void main(String[] args) {
    Employee employee1=new Employee("1","",1.2,new ArrayList<>());
    Employee employee12=new Employee("12","",1.2,new ArrayList<>());
    Employee employee13=new Employee("13","",1.2,new ArrayList<>());
    Employee employee124=new Employee("124","",1.2,new ArrayList<>());
    Employee employee125=new Employee("125","",1.2,new ArrayList<>());
    Employee employee136=new Employee("136","",1.2,new ArrayList<>());
    employee1.add(employee12);
    employee1.add(employee13);
    employee12.add(employee124);
    employee12.add(employee125);
    employee13.add(employee136);
    System.out.println(employee1.toString());
    for (Employee employee : employee1.getEmployeeList()) {
      System.out.println(employee.toString());
      if (employee.getEmployeeList() != null) {

      }
    }
    showTree(employee1);
  }

   public static void showTree(Employee employee){
     System.out.println(employee.toString());
    while (employee.getEmployeeList()==null){
      for (Employee emp :employee.getEmployeeList()){
        showTree(emp);
      }

    }
   }
}
