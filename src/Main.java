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
  }
}
