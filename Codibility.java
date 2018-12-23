/**
 * Codibility
 */
public class Codibility {

  public static int solution(int N) {
    int maxLength = 0;
    int currentLenght = 0;
    for (char digit : String.valueOf(N).toCharArray()) {
      System.out.println(String.valueOf(digit).equals("0"));

    }
    return N;
  }

  public static void main(String[] args) {
    System.out.println(solution(1000010001));
  }
}