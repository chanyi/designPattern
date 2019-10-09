package com.simba.prototype.controller;

import com.simba.prototype.model.Prototype;
import com.simba.prototype.model.Prototype.Inner;
import java.util.Date;

public class PrototypeController {

  private  static  int  objCount = 1000;
  public static void main(String[] args) throws CloneNotSupportedException{
    Prototype prototype = new Prototype();
    prototype.change();
    //创建对象的时候为什么不new一个，而使用clone函数，clone函数的相比new一个对象的优点是？
    //1、new的方式要通过构造函数，如果构造函数很复杂,有输出，那么new的时间就要很多，clone方式比new方式快
    //2、如果构造方法什么都不做，那么new方式比clone方式快,jvm的性能优化之后，new的速度也不慢，在时间上并没有太多优点
    //3、创建实例过程复杂的时候，可以使用clone方法简化创建对象过程
    //4、clone方式可以在运行的过程中动态的获取一个对象的状态
    Prototype prototype1  = (Prototype) prototype.clone();
    Prototype prototype2  = (Prototype) prototype.cloneDeep();
    //使用这样的方式clone是浅clone，得到的对象不相等
    System.out.println("prototype:"+prototype.toString());
    System.out.println("prototype1:"+prototype1.toString());
    System.out.println("prototype:"+prototype);
    System.out.println("prototype1:"+prototype1);
    System.out.println("prototype2:"+prototype2);

    if(prototype.equals(prototype1)){
      System.out.println("equal");
    }else{
      System.out.println("no equal");
    }
    long startSecond1 = new Date().getTime();
    for(int i =0;i<objCount;i++){
      new Prototype(1,2,null);
    }
    long endSecond1 = new Date().getTime();
    System.out.println("new time:"+(endSecond1-startSecond1));

    long startSecond2 = new Date().getTime();
    for(int i =0;i<objCount;i++){
      prototype.clone();
    }
    long endSecond2 = new Date().getTime();
    System.out.println("clone time:"+(endSecond2-startSecond2));

  }

}
