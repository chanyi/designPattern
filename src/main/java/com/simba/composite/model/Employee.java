package com.simba.composite.model;

import java.util.List;

public class Employee {

  private String name;
  private String dept;
  private Double salary;
  private List<Employee> employeeList;

  public Employee(String name, String dept, Double salary,
      List<Employee> employeeList) {
    this.name = name;
    this.dept = dept;
    this.salary = salary;
    this.employeeList = employeeList;
  }

  public void add(Employee employee) {
    this.employeeList.add(employee);
  }

  public void remove(Employee employee) {
    this.employeeList.remove(employee);
  }

  public List<Employee> getEmployee() {
    return employeeList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public List<Employee> getEmployeeList() {
    return employeeList;
  }

  public void setEmployeeList(List<Employee> employeeList) {
    this.employeeList = employeeList;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", dept='" + dept + '\'' +
        ", salary=" + salary +
        ", employeeList=" + employeeList +
        '}';
  }
}
