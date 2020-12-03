package jp.learning.se11_5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
  public static void main(String[] args){
    SubSample sub = new SubSample();
    Sample sample = new SubSample();
    sub = (SubSample)sample;
    sub.test();
    sample.test();

    // 502ページ
    try {
      test(0);
    } catch(IOException e){
      e.getMessage();
    }
  }
  public static void test(int num) throws IOException, IndexOutOfBoundsException{
    if(num < 10){
      throw new FileNotFoundException();
    } else {
      throw new IndexOutOfBoundsException();
    }
  }
}
