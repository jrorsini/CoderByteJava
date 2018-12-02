public class Hello {
  int x = 5;

  static String isLegal(int age) {
    if (age > 21) {
      return "here in America, you are legal to drink!";
    } else {
      return "you are " + age + " years old, you are not legal to drink here!";
    }
  }

  // return(num===0||num===1)?num:num*FirstFactorial(num-1)

  /**
   * function LetterCapitalize(str) { var arr = str.split(" "); for(var i = 0; i <
   * arr.length; i++) { arr[i] = arr[i].substr(0,1).toUpperCase() +
   * arr[i].substr(1, arr[i].length); } // code goes here return arr.join(" "); }
   */

  /**
   * if (num1 - num2 < 0) { return "true"; } else if(num1 == num2) { return "-1";
   * } else { return "false"; }
   * 
   */

  static String CheckNums(int num1, int num2) {
    if (num2 > num1) {
      return "true";
    } else if (num2 == num1) {
      return "false";
    }
    return "-1";
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

  public static void main(String[] args) {
    // System.out.println(letterCapitalize("hello world"));
    // System.out.println(letterCapitalize("i ran there"));
    System.out.println(CheckNums(67, 67));
  }
}