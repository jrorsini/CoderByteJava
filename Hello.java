public class Hello {
  public static void main(String[] args) {
    String name = "Jean-Roger";

    System.out.println("Hello " + name + ", " + isLegal(25));

  }

  static String isLegal(int age) {
    int legalAge2Drink = 21;
    if (age > legalAge2Drink) {
      return "here in America, you are legal to drink!";
    } else {
      return "you are " + age + " years old, you are not legal to drink here!";
    }
  }
}