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
    String name = "Jean-Roger";
    System.out.println("Hello " + name + ", " + isLegal(19));
    System.out.println(SimpleAdding(12));
  }
}