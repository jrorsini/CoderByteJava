import java.util.Scanner;

public class TheScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter you name: ");
    String name = scanner.nextLine();
    System.out.println("You name is: " + name);

    scanner.close();
  }
}