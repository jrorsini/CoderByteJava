
/**
 * Main
 */

import java.util.HashMap;
import java.util.Map;

public class Main {

  enum KeyType {
    APPLE, BANANA, PEAR;
  }

  public static void main(String[] args) {
    Map<KeyType, Integer> dataMap = new HashMap<KeyType, Integer>();
    dataMap.put(KeyType.APPLE, 0);
    dataMap.put(KeyType.BANANA, 0);
    dataMap.put(KeyType.PEAR, 0);
    System.out.println(dataMap.keySet());
  }
}