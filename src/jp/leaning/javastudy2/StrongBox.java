package jp.leaning.javastudy2;

import static jp.leaning.javastudy2.KeyType.*;

public class StrongBox<E> {
  // 練習５−１と５−２
  private E st;
  private KeyType KeyType;
  private long count;

  public StrongBox(KeyType key){
    this.KeyType = key;
  }

  public void put(E st){
    this.st = st;
  }
  public E get(){
    this.count++;
    switch(this.KeyType){
      case PADLOCK :
        if(count < 1024) return null;
        break;
      case BUTTON :
        if(count < 10000) return null;
        break;
      case DIAL :
        if(count < 30000) return null;
        break;
      case FINGER :
        if(count < 1000000) return null;
        break;
    }
    this.count = 0;
    return this.st;
  }
}
