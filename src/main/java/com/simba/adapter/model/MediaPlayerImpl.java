package com.simba.adapter.model;

public class MediaPlayerImpl implements MediaPlayer{

  private MediaAdapter mediaAdapter ;
  @Override
  public void play(String type, String fileName) {
    if("mp3".equals(type)){
      System.out.println("mediaplay play mp3 " +fileName);
    }else{
      if("mp4".equals(type) || "vlc".equals(type)){
        mediaAdapter = new MediaAdapter(type);
        mediaAdapter.play(type,fileName);
      }else{
        System.out.println("格式错误");
      }
    }
  }
}
