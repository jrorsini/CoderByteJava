import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Math;

public class Hello {

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

  public static void DivisionStringified(int num1, int num2) {
    String divivison = String.valueOf(num1 / num2);
    String[] arr = divivison.split("");
    String res = "";
    for (int i = arr.length - 1; i >= 0; i--) {
      if ((i + 1) % 3 == 0) {
        res += arr[i] + ",";
      } else {
        res += arr[i];
      }
    }
    System.out.println(new StringBuilder(res).reverse().toString());
  }

  public static int CountingMinutesI(String str) {

    return 0;

  }

  public static void main(String[] args) {
    DivisionStringified(123456789, 10000);
    DivisionStringified(503394930, 43);
  }
}