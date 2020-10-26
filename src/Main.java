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

    connectWords();
  }

  // 練習１−２
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

    System.out.println(filePath);

    return filePath;
  }
}
