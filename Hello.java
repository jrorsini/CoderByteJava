import java.util.Scanner;

public class Hello {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    System.out.println("Enter your year of birth: ");
    int yearOfBirth = read.nextInt();
    read.nextLine();

    System.out.println("Enter your name, please: ");
    String name = read.nextLine();
    int age = 2018 - yearOfBirth;

    System.out.println("Your name is " + name + ", and you are " + age + " years old");

    read.close();
  }
}