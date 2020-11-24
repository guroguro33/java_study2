package jp.learning.se11;

public class B {
  public B(String str) {
    System.out.println("Bのコンストラクタ実行");
  }

  public B build(String str){
    return new B(str);
  }
}
