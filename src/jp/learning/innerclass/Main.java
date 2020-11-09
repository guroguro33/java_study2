package jp.learning.innerclass;

class Outer {
  int outerField;
  static int outerStaticField;
  // インナークラス宣言
  static class Inner {
    void innerMethod() {
      // staticな外部クラスメンバのみ使用可能
      outerStaticField = 10;
    }
  }

  void outerMethod() {
    // 外部クラスからはInnerで利用可能
    Inner ic = new Inner();
  }
}

class Main {
  public static void main(String[] args){
    // 無関係なクラスからはOuter.innerで利用可能
    Outer.Inner ic = new Outer.Inner();
  }
}
