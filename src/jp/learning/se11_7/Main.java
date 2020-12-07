package jp.learning.se11_7;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args){
    try(Sample s = new Sample()){
      throw new Exception();
    } catch (Exception e){
      System.out.println("A");
    } finally {
      System.out.println("B");
    }

    // 534ページ
    var list = new ArrayList<>();
    list.forEach(val -> System.out.println(val));
  }
}
