public class App {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Tom", 2, 5.0, "black");
        Dog dog = new Dog("John", 3, 6.0);
        Cat cat2 = new Cat ("Jerry", 4, 6.0, "white");

    
        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(dog);
        cat.meow();
        cat.eat();
        dog.eat();
    
    }
}
