import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPQ {

  public static class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
      this.age = age;
      this.name = name;
    }

    public int getAge() {
      return this.age;
    }

    public String getName() {
      return this.name;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override
    public String toString() {
      return this.name + " " + this.age;
    }

  }


  public static void main(String[] args) {
    // Queue
    PriorityQueue<String> pq = new PriorityQueue<>();
    pq.add("Vincent");
    System.out.println(pq); // [Vincent]
    pq.add("Oscar");
    System.out.println(pq); // [Oscar, Vincent]
    pq.add("Lucas");
    System.out.println(pq.size()); // 3
    System.out.println(pq); // [Lucas, Vincent, Oscar] (no ordering)

    // for poll(), ordering -> String natural order
    System.out.println(pq.poll()); // Lucas
    System.out.println(pq.poll()); // Oscar
    System.out.println(pq.poll()); // Vincent

    PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByAge());
    pq2.add(new Person(65, "Vincent"));
    pq2.add(new Person(70, "Oscar"));
    pq2.add(new Person(25, "Lucas"));

    System.out.println(pq2);

    System.out.println(pq2.poll());
    System.out.println(pq2.poll());
    System.out.println(pq2.poll());

  }
}
