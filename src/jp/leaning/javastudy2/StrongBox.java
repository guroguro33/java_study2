package jp.leaning.javastudy2;

public class StrongBox<E> {
  // 練習５−１
  private E st;
  public void put(E st){
    this.st = st;
  }
  public E get(){
    return this.st;
  }
}
