/**
 * Codibility
 */
public class Codibility {

  public static int solution(int N) {
    int maxLength = 0;
    int currentLenght = 0;
    for (char digit : String.valueOf(N).toCharArray()) {
      if (String.valueOf(digit).equals("0")) {
        currentLenght++;
        if (currentLenght > maxLength) {
          maxLength = currentLenght;
        }
      } else {
        currentLenght = 0;
      }
    }
    return maxLength;
  }

  public static void main(String[] args) {
    System.out.println(solution(1000010001));
  }
}