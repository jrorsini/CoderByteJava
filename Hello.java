import java.util.Arrays;
import java.util.Comparator;

public class Hello implements Comparator<String> {
  int x = 5;

  static String isLegal(int age) {
    if (age > 21) {
      return "here in America, you are legal to drink!";
    } else {
      return "you are " + age + " years old, you are not legal to drink here!";
    }
  }

  static String CheckNums(int num1, int num2) {
    return num1 == num2 ? "-1" : String.valueOf(num2 > num1);
  }

  static String letterCapitalize(String str) {
    String arr[] = str.split(" ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i].split("")[0].toUpperCase() + arr[i].substring(1);
    }
    return String.join(" ", arr);
  }

  static int SimpleAdding(int num) {
    int res = 0;
    for (int i = 1; i <= num; i++) {
      res += i;
    }
    return res;
  }

  static int firstFactorial(int num) {
    return num == 1 ? num : num * firstFactorial(num - 1);
  }

  static String TimeConvert(int num) {
    return num / 60 + ":" + num % 60;
  }

  static String AlphabetSoup(String str) {
    char[] arrOfStr = str.toCharArray();
    Arrays.sort(arrOfStr);
    return new String(arrOfStr);
  }

  public int compare(String o1, String o2) {
    if (o1.length() > o2.length()) {
      return 1;
    } else if (o1.length() < o2.length()) {
      return -1;
    } else {
      return 0;
    }
  }

  static String LongestWord(String sen) {
    String[] arr = sen.replaceAll("[^a-zA-Z\\s]", "").split(" ");
    String longest = null;
    int l = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].length() > l) {
        l = arr[i].length();
        longest = arr[i];
      }
    }
    return longest;
  }

  static String SimpleSymbols(String str) {
    String arr[] = str.split("");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].matches("[a-z]")) {
        if (i == 0 || i == arr.length - 1)
          return "false";
        if (arr[i - 1] != "+" && arr[i + 1] != "+") {
          return "false";
        }
      }
    }
    return "true";
  }

  static int VowelCount(String str) {
    int count = 0;
    String[] arr = str.split("");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].matches("[aeiou]"))
        count += 1;
    }
    return count;
  }

  static int wordCount(String str) {
    return str.split(" ").length;
  }

  static String ExOh(String str) {
    int xCount = 0;
    String[] arr = str.split("");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == "x") {
        xCount += 1;
      }
    }
    return String.valueOf(xCount == arr.length / 2);
  }

  static String Palindrome(String str) {
    String[] arr = str.split("");
    String palindrome = "";
    for (int i = arr.length - 1; i >= 0; i--) {
      palindrome += arr[i];
    }
    return String.valueOf(str == palindrome);

    // try with new String builder.
  }

  static int ArrayAdditionI(int[] arr) {

    Arrays.sort(arr);
    System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(ArrayAdditionI(new int[] { 1, 2, 3, 100 }));
  }
}