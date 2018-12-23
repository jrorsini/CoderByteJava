/**
 * ProgramLoops
 */
public class ProgramLoops {
  public static void main(String[] args) {
    int money = 0;
    int max_money = 1000;
    while (money < 100) {
      System.out.println(money);
      money++;
    }

    do {
      System.out.println(money);
      money++;
    } while (money < max_money / 2);
  }
}