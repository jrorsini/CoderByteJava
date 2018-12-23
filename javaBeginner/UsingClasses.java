/**
 * UsingClasses
 */
public class UsingClasses {
  // Class is the blueprint of the dog.
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.bark();
    myDog.checkAge();
    myDog.age = 8;
    myDog.checkAge();

  }
}