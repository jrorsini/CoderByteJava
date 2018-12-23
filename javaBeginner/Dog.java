/**
 * Dog
 */
public class Dog {
  int age;
  static int count = 0;

  public Dog(int dogAge) {
    age = dogAge;
    count++;
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

  public void getCount() {
    System.out.println("There are a total of " + count + " dogs");
  }
}