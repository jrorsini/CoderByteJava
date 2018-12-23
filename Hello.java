import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Math;
import java.text.DecimalFormat;

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

  public static String SwapCase(String str) {
    String sb = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == str.toLowerCase().charAt(i)) {
        sb += str.toUpperCase().charAt(i);
      } else {
        sb += str.toLowerCase().charAt(i);
      }
    }
    return sb;
  }

  public static String HDistance(String[] strArr) {
    int distance = 0;
    for (int i = 0; i < strArr[0].length(); i++) {
      if (strArr[0].charAt(i) != strArr[1].charAt(i)) {
        distance += 1;
      }
    }
    return String.valueOf(distance);
  }

  public static String NumberAddition(String str) {
    String[] arr = str.split("[a-zA-Z\\s]");
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].matches("") == false) {
        res += Integer.parseInt(arr[i]);
      }
    }
    return String.valueOf(res);
  }

  public static String ThirdGreatest(String[] strArr) {
    int l = 0;
    int c = 0;
    for (String str : strArr) {
      if (str.length() > l) {
        l = str.length();
      }
    }
    for (String w : strArr) {
      if (w.length() < l) {
        l = w.length();
        c += 1;
        if (c == 2) {
          return w;
        }
      }
    }
    return strArr[0];
  }

  public static String Palindrome(String str) {
    str = str.toLowerCase().replaceAll("[^a-z]", "");
    return String
        .valueOf(str.toLowerCase().replaceAll("[^a-z]", "").equals(new StringBuilder(str).reverse().toString()));
  }

  public static String ExOh(String str) {
    if (str.length() % 2 == 1) {
      return "false";
    } else {
      int xCount = 0;
      for (char c : str.toCharArray()) {
        if ("x".equals(String.valueOf(c))) {
          xCount += 1;
        }
      }
      return String.valueOf(xCount == str.length() / 2);
    }
  }

  public static boolean PowersofTwo(int num) {
    double logBase2 = (Math.log(num) / Math.log(2));
    return logBase2 == Math.round(logBase2);
  }

  public static int AdditivePersistence(int num) {
    int l = String.valueOf(num).length();
    int res = 0;
    if (l == 1) {
      return 0;
    } else {
      while (l > 1) {
        int sum = 0;
        String[] arr = String.valueOf(num).split("");
        for (String d : arr) {
          sum += Integer.parseInt(d);
        }
        num = sum;
        res += 1;
        l = String.valueOf(sum).length();
      }
      return res;
    }
  }

  public static int MultiplicativePersistence(int num) {
    int l = String.valueOf(num).length();
    int res = 0;
    if (l == 1) {
      return 0;
    } else {
      while (l > 1) {
        int sum = 1;
        String[] arr = String.valueOf(num).split("");
        for (String d : arr) {
          sum *= Integer.parseInt(d);
        }
        num = sum;
        res += 1;
        l = String.valueOf(sum).length();
      }
      return res;
    }
  }

  public static String GroupTotals(String[] strArr) {
    String[] slots;
    slots = new String[10];

    for (int i = 0; i < strArr.length; i++) {
      System.out.println(new StringBuilder(strArr[i]).substring(0, 1));

    }
    System.out.println(slots[0]);
    return strArr[0];
  }

  public static void main(String[] args) {
    System.out.println(GroupTotals(new String[] { "Z:0", "A:-1" }));
    System.out.println(GroupTotals(new String[] { "B:-1", "A:1", "B:3", "A:5" }));
    System.out.println(GroupTotals(new String[] { "X:-1", "Y:1", "X:-4", "B:3", "X:5" }));
  }
}