package jp.learning.se11;

import java.util.List;
import java.util.function.Consumer;

public class Main {
  static int num = 36;
  public static void main(String[] args){
    List<String> list = List.of("A", "B", "C");
    list.forEach(str -> System.out.println(str));
    list.forEach(System.out::println);

    //336ページ
    List<String> list2 = List.of("A", "B", "C");
    Consumer<String> logic2 = new Consumer<String>(){
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    };
    list2.forEach(logic2);

    //ラムダ式で
    Consumer<String> logic3 = (s) -> System.out.println(s);
    list2.forEach(logic3);

    //344ページ
    try{
      int[] array = {};
      array[0] = 10;
      System.out.println("finish");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("error");

    }

    //396ページ
    int num = Main.num;
    System.out.println(num);

    Sample a = new Sample();
    a.sample();
  }
}
