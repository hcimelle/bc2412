import java.util.Scanner;

// JDK vs Java project (load built-in tools, String, Primitives)
// proactively import non-built-in e.g. scanner
public class DemoScanner {
  public static void main(String[] args) {
    String s = "abc";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int num = scanner.nextInt(); // scanner.next
    // num = num * 2;
    // System.out.println("num=" + num); //String + int -> String

    // scanner.nextLine();

    // System.out.println("Please input a string:");
    // String str = scanner.nextLine();
    // System.out.println("str=" + str);

    // for (int i = 0; i < num; i++){
    // System.out.println("hello");
    // }

    // num -> number of days
    // for loop
    int totalHours = 0;

    for (int i = 0; i < num; i++) {
      totalHours += 24;
    }
    System.out.println(totalHours);

    // num -> number of minutes
    // for loop
    int totalMinutes = 0;
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < 24; j++) {
        totalMinutes += 60;
      }
    }
    System.out.println(totalMinutes);

  }
}
