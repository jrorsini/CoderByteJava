/**
 * MyClass
 */
public class MyClass {
  int x = 5;
  int y = 3;

  public static void main(String[] args) {
    MyClass myObj1 = new MyClass();
    MyClass myObj2 = new MyClass();
    MyClass myObj3 = new MyClass();
    myObj3.x = 40;
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
    System.out.println(myObj3.x);
  }
}