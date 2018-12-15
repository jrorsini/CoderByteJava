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

  public static int convert2Minutes(String str) {
    String time = new StringBuilder(str).substring(0, str.length() - 2);
    int hour = Integer.parseInt(time.split(":")[0]);
    int minute = Integer.parseInt(time.split(":")[1]);
    return hour * 60 + minute;
  }

  public static int CountingMinutesI(String str) {
    String time1 = str.split("-")[0];
    String time2 = str.split("-")[1];
    String timeFrame1 = new StringBuilder(time1).substring(time1.length() - 2, time1.length());
    String timeFrame2 = new StringBuilder(time2).substring(time2.length() - 2, time2.length());
    int timeInMinutes1 = convert2Minutes(time1);
    int timeInMinutes2 = convert2Minutes(time2);
    if (timeFrame1.equals(timeFrame2)) {
      if (timeInMinutes1 < timeInMinutes2) {
        return timeInMinutes2 - timeInMinutes1;
      }
    } else {

    }
    return 0;
  }

  public static void main(String[] args) {
    DivisionStringified(123456789, 10000);
    DivisionStringified(503394930, 43);
    System.out.println(CountingMinutesI("9:00am-10:00am"));
  }
}