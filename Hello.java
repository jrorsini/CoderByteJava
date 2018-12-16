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
      } else {
        if (timeFrame1.equals("am")) {
          return convert2Minutes("24:00xx") - timeInMinutes1 + timeInMinutes2;
        } else {
          return convert2Minutes("12:00xx") - timeInMinutes1 + timeInMinutes2 + convert2Minutes("12:00xx");
        }
      }
    } else {
      if (timeFrame1.equals("am")) {
        return convert2Minutes("12:00xx") - timeInMinutes1 + timeInMinutes2;
      } else {
        return convert2Minutes("12:00xx") - timeInMinutes1 + timeInMinutes2;
      }
    }
  }

  public static String DashInsert(String num) {
    String arr[] = num.split("");
    String res = "";
    for (int i = 0; i < arr.length; i++) {
      if (i < arr.length - 1 && Integer.parseInt(arr[i]) % 2 != 0 && Integer.parseInt(arr[i + 1]) % 2 != 0) {
        res += arr[i] + '-';
      } else {
        res += arr[i];
      }
    }
    return res;
  }

  public static void main(String[] args) {
    DivisionStringified(123456789, 10000);
    DivisionStringified(503394930, 43);
    System.out.println(CountingMinutesI("2:03pm-1:39pm"));
  }
}