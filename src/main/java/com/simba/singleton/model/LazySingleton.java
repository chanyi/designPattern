package com.simba.singleton.model;

public class LazySingleton {

  //静态构造方法
  private LazySingleton(){

  }
  //类加载的时候不创建实例
  private static volatile LazySingleton lazySingleton= null;
  //获取实例的方法
  public static synchronized LazySingleton getInstance(){
    if(lazySingleton == null){
        lazySingleton = new LazySingleton();
    }
    return lazySingleton;
  }

  public static  void main(String[] args){
    LazySingleton lazySingleton1 = getInstance();
    LazySingleton lazySingleton2 = getInstance();
    if(lazySingleton1 == lazySingleton2){
      System.out.println("equal!");
    }else{
      System.out.println("no equal");
    }
  }
}
