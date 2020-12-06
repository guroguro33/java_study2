package jp.learning.se11_7;

public class Sample implements AutoCloseable{
  @Override
  public void close() throws Exception {
    System.out.println("C");
  }
}
