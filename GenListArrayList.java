import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList
 */
public class GenListArrayList {

  public static void main(String[] args) {
    List<String> myStrings = new ArrayList<String>();
    myStrings.add("Hello");
    myStrings.add("my");
    myStrings.add("name");
    myStrings.add("is");
    myStrings.add("JR");

    System.out.println(myStrings.get(0));
  }
}