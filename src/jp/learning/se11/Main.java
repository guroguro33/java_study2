package jp.learning.se11;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import static java.time.DayOfWeek.*;

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

    // 397ページ
    int data = 1;
    switch(data){
      default: System.out.print("C");
      case 0: System.out.print("A");
        break;
      case 10: System.out.print("B");
        break;
    }

    // 457ページ
    System.out.println("10".hashCode());

    // 403ページ
    var today = LocalDate.now().with(TUESDAY).getDayOfWeek();
    switch(today){
      case SUNDAY:
      case SATURDAY:
        System.out.println("weekend");
        break;
      case MONDAY:
        case FRIDAY:
        System.out.println("working");
      default:
        System.out.println("other");
    }
    System.out.println(today);

    // 406ページ
    int[][] array = {{1,2,3},{1,2,3}};
    int[] array2 = {0,1};
    int[][][] array3 = new int[2][2][2];
    array3[0][0] = array2;
    array3[0][1] = array2;
    array3[1][0] = array2;
    array3[1][1] = array2;
    System.out.println(array3[0][0][1]);

  }
}
