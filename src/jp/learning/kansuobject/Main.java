package jp.learning.kansuobject;

public class Main {
  public static int sub(int a, int b){
    return a - b;
  }
  public static void main(String[] args){
    MyFunction func = Main::sub;
    int a = func.call(5, 3);
    System.out.println(a);

    // 練習６−１
    Func1 myFunc1 =  FuncList::isOdd;
    System.out.println(myFunc1.isOdd(5));

    // staticメソッドではないため、インスタンス生成
    FuncList funcList = new FuncList();
    // そのインスタンスの関数を関数オブジェクトとして代入
    Func2 myFunc2 = funcList::addNamePrefix;
    System.out.println(myFunc2.addNamePrefix(true, "toru"));

  }


}
