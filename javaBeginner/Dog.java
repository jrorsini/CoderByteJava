/**
 * Dog
 */
public class Dog {
  int age;
  public Dog(int dogAge) {
    age = dogAge;
  }
  public static void main(String[] args) {
    System.out.println("instatiated");
  }

  public void bark() {
    System.out.println("Woof!");
  }

  public void checkAge() {
    System.out.println(age);
  }
}