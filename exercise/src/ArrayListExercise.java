import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class ArrayListExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    ArrayList<Integer> integers = new ArrayList<>();
    integers.add(10);
    integers.add(20);
    integers.add(30);
    integers.add(40);
    integers.add(50);
    System.out.println(integers); // [10, 20, 30, 40, 50]
    integers.remove(2);
    System.out.println(integers); // [10, 20, 40, 50]
    System.out.println(integers.size()); // 4


    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    ArrayList<String> strings = new ArrayList<>();
    strings.add("Apple");
    strings.add("Banana");
    strings.add("Mango");
    strings.add("Orange");
    System.out.println(strings.contains("Grapes")); //false
    strings.add("Grapes");
    strings.set(2,"Peach");
    System.out.println(strings); //[Apple, Banana, Orange, Grapes, Peach]

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.

    ArrayList<Integer> integers3 = new ArrayList<>();
    integers3.add(10);
    integers3.add(20);
    integers3.add(10);
    integers3.add(30);
    integers3.add(40);
    integers3.add(20);
    integers3.add(50);
    System.out.println(integers3); //[10, 20, 10, 30, 40, 20, 50]

    HashSet<Integer> integers31 = new HashSet<>();

    for (Integer integer: integers3){
      integers31.add(integer);
    }
    System.out.println(integers31); // [50, 20, 40, 10, 30]

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

    HashSet<String> strings4 = new HashSet<>();
    strings4.add("USA");
    strings4.add("India");
    strings4.add("China");
    strings4.add("Japan");
    System.out.println(strings4); // [USA, China, Japan, India]
    strings4.add("Canada");
    strings4.add("India");
    System.out.println(strings4); // [Canada, USA, China, Japan, India]

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    HashSet<Double> double5 = new HashSet<>();
    double5.add(1.1);
    double5.add(2.2);
    double5.add(3.3);
    double5.add(4.4);
    double5.add(5.5);
    System.out.println(double5.contains(3.3)); //true
    double5.remove(2.2);
    System.out.println(double5.size());
   
    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

    HashSet<Integer> integers61 = new HashSet<>();
    integers61.add(10);
    integers61.add(20);
    integers61.add(30);
    integers61.add(40);
    System.out.println(integers61);

    HashSet<Integer> integers62 = new HashSet<>();
    integers62.add(30);
    integers62.add(40);
    integers62.add(50);
    integers62.add(60);
    System.out.println(integers62);

    HashSet<Integer> commonNumbers = new HashSet<>();
    for (Integer integer: integers61){
            if (integers62.contains(integer)) {
        commonNumbers.add(integer);
      }
    }
    System.out.println("Common Numbers = " + commonNumbers);



    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    HashSet<String> hashSet7 = new HashSet<>();
    hashSet7.add("Cherry");
    hashSet7.add("Steve");
    hashSet7.add("Chloe");
    hashSet7.add("Jenny");
    hashSet7.add("Vicky");

    System.out.println(hashSet7);

    ArrayList<String> arrayList7 = new ArrayList<>(hashSet7);
    System.out.println(arrayList7);
    


    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

    ArrayList<String> arrayList8 = new ArrayList<>();
    arrayList8.add(new Student(1, "Alice"));
    arrayList8.add(new Student(2, "Bob"));
    arrayList8.add(new Student(3, "Charlie"));
    System.out.println(arrayList8);


    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.

  }

  public static class Student {
    private int id;
    private String name;

  public Student (int id, String name){
    this.id = id;
    this.name = name;
  }

  public int getId (){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

    // Constructor
    // getter, setter, etc.
  }
}