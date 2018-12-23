/**
 * switchStatement
 */
public class switchStatement {
  public static void main(String[] args) {
    int age = 14;

    switch (age) {
    case 13:
      System.out.println("You are 13 years old!");
      break;
    case 14:
      System.out.println("You are 14!");
      break;
    case 15:
      System.out.println("You are in high school.");
    default:
      System.out.println("You're still a kid!");
      break;
    }

  }
}