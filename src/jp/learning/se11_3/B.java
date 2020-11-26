package jp.learning.se11_3;

public class B extends A{
  public int test(int num){
    if(isValue(num)){
      return num;
    }
    return 0;
  }
  public static void main(String[] args){
    B b = new B();
    System.out.println(b.test(10));
  }
}
