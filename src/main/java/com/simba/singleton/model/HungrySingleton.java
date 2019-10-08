package com.simba.singleton.model;

public class HungrySingleton {

  //静态构造方法
  private HungrySingleton(){ }
  //类加载的时候就创建实例,以后不会再改变，是线程安全的，可以直接用于多线程
  private static volatile HungrySingleton hungrySingleton= new HungrySingleton();
  //获取实例的方法
  public static synchronized HungrySingleton getInstance(){
    return hungrySingleton;
  }

  public static  void main(String[] args){
    HungrySingleton hungrySingleton1 = getInstance();
    HungrySingleton hungrySingleton2 = getInstance();
    if(hungrySingleton1 == hungrySingleton2){
      System.out.println("equal!");
    }else{
      System.out.println("no equal");
    }
  }
}
