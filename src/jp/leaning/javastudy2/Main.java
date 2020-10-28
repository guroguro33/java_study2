package jp.leaning.javastudy2;

import java.util.Calendar;
import java.util.Date;

public class Main {
  public static void main(String[] args){
    // 練習1-1
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= 100; i++){
      sb.append(i).append(',');
    }
    System.out.println(sb);

    String s = sb.toString();
    String[] a = s.split(",");
    System.out.println(a);

    System.out.println(connectWords());

    // 練習１−３
    String str1 = ".*"; // 全ての文字列
    String str2 = "A¥d{1,2}"; // １文字目がA、２文字目が数字、３文字目が数字かなし
    String str3 = "U[A-Z]{3}"; // １文字目がU、２〜４文字目が英大文字

    // 練習２−１
    Date now = new Date();
    Calendar cal = Calendar.getInstance();
    // 取得した日時情報をCalendarにセット
    cal.setTime(now);
    


  }

  // 練習１−２3
  public static String connectWords(){
    String folder = "c:¥javadev";
    String file = "readme.txt";

    if(!folder.matches(".*¥")){
      StringBuilder sb = new StringBuilder(folder);
      sb.append("¥");
      folder = sb.toString();
      System.out.println(sb);
    }

    String filePath = folder + file;

    return filePath;
  }
}