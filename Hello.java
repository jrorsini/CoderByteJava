public class Hello {
  int x = 5;

  static String isLegal(int age) {
    if (age > 21) {
      return "here in America, you are legal to drink!";
    } else {
      return "you are " + age + " years old, you are not legal to drink here!";
    }
  }

  public static void main(String[] args) {
    String name = "Jean-Roger";
    System.out.println("Hello " + name + ", " + isLegal(19));
    Hello myObj1 = new Hello(); // Object 1
    Hello myObj2 = new Hello(); // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}