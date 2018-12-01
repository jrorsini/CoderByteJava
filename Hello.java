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
    Hello myObj = new Hello();
    System.out.println(myObj.x);
  }
}