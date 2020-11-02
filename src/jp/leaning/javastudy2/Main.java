package jp.leaning.javastudy2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

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

    // リスト３−３　イテレータ
    ArrayList<String> names = new ArrayList<>();
    names.add("湊");
    names.add("朝香");
    names.add("菅原");
    Iterator<String> it = names.iterator();
    while(it.hasNext()){
      String e = it.next(); //イテレータの矢印は0番目の手前になるので、1つ進める
      System.out.println(e);
    }

    // リスト３−７　Map
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    prefs.put("熊本県", 181);
    int tokyo = prefs.get("東京都");
    System.out.println("東京都の人口は" + tokyo);
    // prefs.remove("京都府");
    // int kyoto = prefs.get("京都府");
    prefs.put("熊本県", 182);
    int kumamoto = prefs.get("熊本県");
    System.out.println("熊本県の人口は" + kumamoto);

    for(String key : prefs.keySet()){
      int value = prefs.get(key);
      System.out.println(key + "の人口は" + value);
    }

    // 練習３−２
    Hero saitou = new Hero("斎藤");
    Hero suzuki = new Hero("鈴木");
    List<Hero> heroList = new ArrayList<>();
    heroList.add(saitou);
    heroList.add(suzuki);
    for(Hero h: heroList){
      System.out.println(h.getName());
    }

    // 練習３−３
    Map<Hero, Integer> heros = new HashMap<Hero, Integer>();
    heros.put(saitou, 3);
    heros.put(suzuki , 7);
    for(Hero key : heros.keySet()){
      Integer value = heros.get(key);
      System.out.println(key.getName() + "が倒した敵 = " + value);
    }





  }

  // 練習１−２３
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
