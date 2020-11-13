package jp.learning.JvmAndReflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Launcher {
  public static void main(String[] args){
    String fqcn = args[0];
    String startUp = args[1];

    try{
      Class<?> clazz = Class.forName(fqcn);
      System.out.println(clazz);
      showMemory();
      listMethods(clazz);

//      if(startUp.equals("E")){
//
//      }


    } catch(Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);

    }

  }

  // 使用中メモリ取得
  public static void showMemory(){
    long free = Runtime.getRuntime().freeMemory();
    long total = Runtime.getRuntime().totalMemory();
    double usedMemory = (total - free) / 1024 / 1024;
    System.out.println("使用中のメモリは" + usedMemory + "MB");
  }

  // メソッドの一覧を取得
  public static void listMethods(Class<?> clazz){
    System.out.println("メソッドの一覧を表示します");
    Method[] methods = clazz.getDeclaredMethods();
    for(Method m : methods){
      System.out.println(m.getName());
    }
  }

}
