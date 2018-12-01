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

  static Int firstFactorial(int num) {
    return num > 0 ? 0 : 1;
  }

  public static void main(String[] args) {
    String name = "Jean-Roger";
    System.out.println("Hello " + name + ", " + isLegal(19));
    System.out.println(firstFactorial(2));
  }
}