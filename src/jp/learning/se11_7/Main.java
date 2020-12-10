package jp.learning.se11_7;

import java.time.LocalDate;
import java.util.ArrayList;
import static java.time.DayOfWeek.*;

public class Main {
  public static final int length = 3;
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

    // 548ページ
    int[] array = new int[length];
    for (int i = 0; i < 3; i++){
      System.out.println(array[i]);
    }

    Integer a = new Integer(1);
    int b = 1;
    System.out.println(a + b);

    Integer[] array2 = new Integer[length];
    for (int i = 0; i < 3; i++){
      System.out.println(array2[i]);
    }

    // 403ページ
    var today = LocalDate.now().with(MONDAY).getDayOfWeek();
    System.out.println(today);
    switch(today){
      case SUNDAY:
      case SATURDAY:
        System.out.println("weekend");
        break;
      case MONDAY:
          FRIDAY: System.out.println("working");
      default:
        System.out.println("other");
    }
  }
}
