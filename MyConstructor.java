public class MyConstructor {
  String name;

  public MyConstructor() {
    System.out.println("This is a no argument constructor");
    name = "BeginnersBook.com";
  }

  public static void main(String[] args) {
    MyConstructor test = new MyConstructor();
    new MyConstructor();
    System.out.println(test.name);
  }
}