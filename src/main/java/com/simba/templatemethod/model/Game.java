package com.simba.templatemethod.model;

public abstract class Game {
  abstract void initializa();
  abstract void startPlay();
  abstract void endPlay();
  //模板方法，定一个算法的框架
  //抽象方法用final，接口用default会被子类实现，所以不推荐使用接口（public>protected>default>private）
  public final void play(){
    //先初始化游戏
    initializa();
    //再开始游戏
    startPlay();
    //最后结束游戏
    endPlay();
  }

}
