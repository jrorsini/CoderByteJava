import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Math;

public class Hello {
  String name;

  Hello() {
    this.name = "Orsini";
  }

  public static int SecondGreatLow(int[] arr) {
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    return 0;
  }

  public static void main(String[] args) {
    Hello obj = new Hello();
    System.out.println(obj.name);
  }
}