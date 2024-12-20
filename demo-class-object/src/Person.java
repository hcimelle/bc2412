public class Person { //blueprint - define a Person
  //attributes
  private String name;
  private int age;
  private String email;

  // constructor (not a method)
  // constructor is to create object
  public Person(String name, int age, String email){
    this.name = name;
    this.age = age;
    this.email = email;
  }

  // getter (instance = object)
  // instance Method is able to return self value
public String getName(){
  return this.name;
}

public int getAge(){
  return this.age;
}

public String getEmail(){
  return this.email;
}
// setter
// void -> return nothing

public void setName(String name){
  this.name = name;
}
public void setAge(int age){
  this.age = age;
}
public void setEmail(String email){
  this.email = email;
}


    public static void main (String[] args) {
    int x = 3;
    System.out.println(x);
    int[] arr = new int[3];

    String person = "vincent";
    int personAge = 18;

    String person2 = "lucas";
    int personAge2 = 17;

    String[] names = new String[] {"vincent", "lucas"};
    int[] ages = new int[] {18,17};

    Person p1 = new Person("vincent", 18, "v@email.com");
    System.out.println(p1.getName()); // vincent
    System.out.println(p1.getAge()); // 18
    System.out.println(p1.getEmail()); // v@email.com

    Person p2 = new Person("lucas", 17, "l@email.com");
    System.out.println(p2.getName()); // lucas
    System.out.println(p2.getAge()); // 17
    System.out.println(p2.getEmail()); // l@email.com

    Person p3 = p2;
    System.out.println(p3.getName()); // lucas
    System.out.println(p3.getAge()); // 17
    System.out.println(p3.getEmail()); // l@email.com

    p2.setAge(30);
    System.out.println(p2.getAge()); //
    System.out.println(p3.getAge()); //

    p2.setName("Peter");
    System.out.println(p2.getName()); //
    System.out.println(p3.getName()); //

    Person[] persons = new Person[] {p1, p2, new Person("dicky", 19, "d@email.com")};
    for (Person p : persons) {
      //vincent, 18, v@email.com
      System.out.println(p.getName()+ ", " + p.getAge()+ ", " + p.getEmail());
    }
    
    String s1 = "hello";
    String[] strings = new String[] {s1, "world"};

  }
}
