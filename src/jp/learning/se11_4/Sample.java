package jp.learning.se11_4;

public class Sample {
  int a;
  int b;
  int c;
  int d;
  int setD(int num){
    d = num;
    return d;
  }
  void setAll(int x){
    a = b = this.c = setD(x);
  }
  @Override
  public String toString(){
    return "Sample [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
  }
  public static void main(String[] args){
    Sample s = new Sample();
    s.setAll(10);
    System.out.println(s);
  }
}
