import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Math;

public class Hello {
  String name;

  Hello() {
    this.name = "Orsini";
  }

  public static String SecondGreatLow(int[] arr) {
    Arrays.sort(arr);
    if (arr.length == 0) {
      return arr[0] + " " + arr[1];
    } else if (arr.length == 3) {
      return arr[1] + " " + arr[1];
    } else {
      return arr[1] + " " + arr[arr.length - 2];
    }
  }

  public static void main(String[] args) {
    Hello obj = new Hello();
    System.out.println(SecondGreatLow(new int[] { 5, 5, 1, 2, 3 }));
    System.out.println(obj.name);
  }
}