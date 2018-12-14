public class MyConstructor {
  String name;
  int empId;
  String empName;

  public MyConstructor() {
    System.out.println("This is a no argument constructor");
    this.name = "BeginnersBook.com";
  }

  MyConstructor(int id, String name) {
    this.empId = id;
    this.empName = name;
  }

  void info() {
    System.out.println("Id: " + empId + " Name: " + empName);
  }

  public static void main(String[] args) {
    MyConstructor test = new MyConstructor();
    MyConstructor obj1 = new MyConstructor(1, "Anne-Sophie");
    MyConstructor obj2 = new MyConstructor(2, "Jean-Roger");
    // new MyConstructor();
    System.out.println(test.name);
  }
}