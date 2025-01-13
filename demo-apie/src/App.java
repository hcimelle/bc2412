public class App {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Tom", 2, 5.0, "black");
        Dog dog = new Dog("John", 3, 6.0);
        Cat cat2 = new Cat ("Tom", 2, 5.0, "black");

    
        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(dog);
        cat.meow();
        cat.eat();
        dog.eat();

        System.out.println(cat.hashCode());
        System.out.println(cat2.hashCode());
    
    }
}
