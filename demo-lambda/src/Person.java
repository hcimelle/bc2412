/**
 * Purpose :
 * @author vincent.lau
 * @since
 * @version
 * Date :
 */

public class Person {
    private String name;
    private int age;

    public static Builder builder() {
        return new Builder();
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

  
    public static class Builder {
        private String name;
        private int age;

        // setter
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        //setter 
        public Builder age(int age) {
            this.age = age;
            return this;

        }

        public Person build() {
            return new Person(this.name, this.age);
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Vincent", 18);

    // advantages: 
    // 1. you no longer need to pass null for those unnecessary attributes
    // 2. if there are many attribute (i.e. 20+ String), 
    // you have to manually check if the value is passed to the right parameters.
        Person p2 = Person.builder()//
        .name("Vincent")//
        .age(18)//
        .build();

        Person p4 = Person.builder()//
        .build();
        System.out.println(p4.getAge());
        System.out.println(p4.getName());
    }
}


