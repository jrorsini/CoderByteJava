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
    if (arr.length == 0) {
      return String.valueOf(arr[0] + " " + arr[1]);
    } else if (arr.length == 3) {
      return String.valueOf(arr[1] + " " + arr[1]);
    } else {
      return String.valueOf(arr[1] + " " + arr[arr.length - 2]);
    }
  }

  public static void main(String[] args) {
    Hello obj = new Hello();
    SecondGreatLow(new int[] { 5, 5, 1, 2, 3 });
    System.out.println(obj.name);
  }
}