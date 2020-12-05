package jp.learning.se11_6;

import java.util.Map;

public class B extends A{
  public void set(Map<String, String> map){
    set(map.values());
  }
}
