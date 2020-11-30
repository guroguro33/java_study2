package jp.learning.se11_4;

public class Sample {
  int a;
  int b;
  int c;
  int d;
  int setD(int num){
    d = num;
    return d;
  }
  void setAll(int x){
    a = b = this.c = setD(x);
  }
  @Override
  public String toString(){
    return "Sample [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
  }
  // 440ページ
  private String[] array;
//  public Sample(String[] array){
//    this.array = array;
//  }
  public Sample(String... array){
    this.array = array;
  }

  public static void main(String[] args){
    Sample s = new Sample();
    s.setAll(10);
    System.out.println(s);

    int f = 12_34_567;
    System.out.println(f);

    // 436ページ
    int x = 1;
    int y = 3;
    if(y > 2){
      x = ++y;
      y = x + 5;
    } else {
      y++;
    }
    System.out.println(x + ", " + y);

  }
}
