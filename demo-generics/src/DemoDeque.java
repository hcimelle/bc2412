import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {
  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>();
    strings.add("Lucas"); //addLast
    strings.add("Vincent"); 
    strings.add("Oscar");
    strings.addFirst ("Jenny");
    System.out.println(strings); // [Jenny, Lucas, Vincent, Oscar]
    System.out.println(strings.poll()); //jenny, pollFirst()
    System.out.println(strings.pollLast()); // oscar
    System.out.println(strings.peek()); // lucas,peekFirst
    System.out.println(strings.peekLast()); // vincent

    //support for loop
    //support remove
    //contains
    //Practice ArrayDeque

  Deque<String> ss2 = new ArrayDeque<>();
  Queue<String> ss3 = new ArrayDeque<>();
  }
}
