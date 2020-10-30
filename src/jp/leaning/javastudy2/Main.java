package jp.leaning.javastudy2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    // 「日」の数値を取得
    int day = cal.get(Calendar.DATE);
    // 100日後をセットする
    cal.add(Calendar.DAY_OF_MONTH, 100);
    // Calendarの日付情報をDate型に変換します。
    Date future = cal.getTime();
    // 指定形式で表示
    SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(sdf.format(future));

    // 練習2-2
    // 現在日時を取得
    LocalDate ld = LocalDate.now();
    // 100日後をセットする
    ld = ld.plusDays(100);
    DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    String after = ld.format(f);
    System.out.println(ld);


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
