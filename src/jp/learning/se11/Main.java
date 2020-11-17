package jp.learning.se11;

import java.util.List;

public class Main {
  public static void main(String[] args){
    List<String> list = List.of("A", "B", "C");
    list.forEach(str -> System.out.println(str));
    list.forEach(System.out::println);

    //344ページ
    try{
      int[] array = {};
      array[0] = 10;
      System.out.println("finish");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("error");

    }
  }
}
