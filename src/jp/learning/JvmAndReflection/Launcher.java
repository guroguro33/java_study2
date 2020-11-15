package jp.learning.JvmAndReflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Launcher {
  public static void main(String[] args){
    String fqcn = args[0];
    String startUp = args[1];

    try{
      // 受け取ったFQCNの名前を表示
      Class<?> clazz = Class.forName(fqcn);
      System.out.println(clazz);

      // 使用中メモリ表示
      showMemory();

      // FQCN内のメソッド表示
      listMethods(clazz);

      // 第二引数startUpによる起動方法
      if(startUp.equals("E")){
        launchExternal(clazz);
      } else if(startUp.equals("I")) {
        launchInternal(clazz);
      } else {
        throw new IllegalArgumentException("起動方法の指定が不正です。");
      }

      showMemory();
      System.exit(0);

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

  // 別プロセスで起動する
  public static void launchExternal(Class<?> clazz) throws Exception {
    ProcessBuilder pb = new ProcessBuilder(
            "java", clazz.getName()
    );

    System.out.println(clazz.getName());
    Process proc = pb.start();
    proc.waitFor(); // プロセス終了まで待つ
  }

  public static void launchInternal(Class<?> clazz) throws Exception {
    Method m = clazz.getMethod("main", String[].class);

    String[] args = {};
    m.invoke(null, (Object)args);

  }

}
