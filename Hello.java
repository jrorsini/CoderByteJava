import java.util.Arrays;

public class Hello {
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
    System.out.println(arrOfStr);
    Arrays.sort(arrOfStr);
    // return String.join("", arrOfStr);
    return new String(arrOfStr);
  }

  public static void main(String[] args) {
    // System.out.println(letterCapitalize("hello world"));
    // System.out.println(letterCapitalize("i ran there"));
    // System.out.println(CheckNums(67, 67));
    // System.out.println(TimeConvert(126));
    // System.out.println(TimeConvert(45));
    System.out.println(AlphabetSoup("coderbyte"));
  }
}