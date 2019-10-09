package com.simba.prototype.model;


import javax.persistence.criteria.CriteriaBuilder.In;

public class Prototype implements Cloneable {

  public class Inner implements  Cloneable{
    int a = 0;

    public int getA() {
      return a;
    }

    public void setA(int a) {
      this.a = a;
    }

    public Inner clone() throws CloneNotSupportedException{
      return (Inner)super.clone();
    }

  }

  private int p1;
  private int p2;
  private Inner inner;

  public Prototype() {
    this.p1 =1;
    this.p2 =2;
    this.inner = new Inner();
  }

  public  void change(){
    this.p1 = 3;
    this.p2 = 4;
    this.inner = new Inner();
  }
  public Prototype(int p1,int p2,Inner inner) {
    this.p1 =p1;
    this.p2 =p2;
    this.inner = inner;
  }

  @Override
  public String toString() {
    return "Prototype{" +
        "p1=" + p1 +
        ", p2=" + p2 +
        ", inner=" + inner +
        '}';
  }

  public Object clone() throws CloneNotSupportedException {
    //浅拷贝的方式
    //属性指向的内存地址是一致的，并没有重新生成放到一个内存块中
    return  super.clone();
  }
  public  Object cloneDeep () throws CloneNotSupportedException{
    //深拷贝方式
    //如果将对象的属性额外赋值
    Prototype prototype = (Prototype) super.clone();
    prototype.inner = prototype.inner.clone();
    return  prototype;
  }

}
