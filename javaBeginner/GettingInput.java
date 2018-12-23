
import java.util.Scanner;

/**
 * GettingInput
 */
public class GettingInput {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number from 1 - 100");
    int number = input.nextInt();
    // float number = input.nextFloat();
    if (number > 0 && number <= 100) {
      System.out.println("Congrats, you are a human");
    } else {
      main(args);
    }
    // System.out.println("The number you entered is: " + number);
  }
}