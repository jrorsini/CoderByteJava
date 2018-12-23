/**
 * VariableScopes
 */
public class VariableScopes {
  // as long as the class exists, the age exists.
  static int age = 25;

  public static void main(String[] args) {
    int x = 13;
    if (x > 50) {
      int y = 25;
      System.out.println(y);
      if (y < 10) {
      }
    } else {

    }
    // y is not accessible outside the code block.
    // int result = x + y;
  }
}