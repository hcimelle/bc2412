import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {
        // traditional
        int[] arr = new int[] {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int integer : arr) {
            System.out.println(integer);
        }

        // int [], Integer[], ArrayList<Integer>
        // Java8 (2014) : Stream style : List -> Stream -> List
        // before Java8 : for loop (list)

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> newIntegers = integers.stream() // Stream<Integer>
                .filter(e -> e % 2 == 0) // "e -> e % 2 == 0" -> Predicate
                .collect(Collectors.toList()); // always return new ArrayList

        System.out.println(integers);
        System.out.println(newIntegers);

        // Declare String array with some elements
        // filter string length > 5 and contain 'a'

        List<String> strings = Arrays.asList("hello", "good", "morning");

        // for loop + if
        List<String> newStrings = strings.stream()//
                .filter(e -> e.length() > 5 && e.contains("a")) // contains or
                .collect(Collectors.toList());

        System.out.println(strings);
        System.out.println(newStrings);

        // Define a book list
        // filter book name contain "Herry" case insensitive

        List<Book> books = Arrays.asList(new Book("ABC Herry"),
                new Book("IJK HERRY"), new Book("Ben"));

        List<Book> newBooks = books.stream()
                // .filter(e -> "Herry".equalsIgnoreCase(e.getName()))
                .filter(e -> e.getName().toUpperCase().contains("HERRY"))//
                .collect(Collectors.toList()); // return to new ArrayList<>()
        System.out.println(newBooks);

        // map(): Change the object type, but the quantity of element won't change
        List<String> bookNames = books.stream().map(e -> e.getName())//
                .collect(Collectors.toList());
        System.out.println(bookNames);

        // filter + map
        // for loop + if + restructure
        List<String> newBookNames = books.stream() //
                .filter(e -> e.getName().toUpperCase().contains("HERRY"))//
                .map(e -> e.getName())//
                .collect(Collectors.toList());

        System.out.println(newBookNames);

        // for loop + if + procedures
        books.stream()//
                .filter(e -> e.getName().startsWith("A"))//
                .forEach(e -> {
                    System.out.println(e.getName());
                });

        // convert 3 book names to 3 books
        List<String> bookNames2 = List.of("abc", "herry", "def");
        List<Book> newBook2 = bookNames2.stream()
        .map(e -> new Book(e))
        .collect(Collectors.toList());

        System.out.println(newBook2);

        // Stream sorted()
        // Collections.sort() + Comparator
        // Arrays.sort()

        // Integer[] vs int[], int vs Integer
        Integer[] arr2 = new Integer[] {2, 4, -1, 1, -3};
        Arrays.sort(arr2,(i1, i2) -> i1 > i2 ? -1 : 1);// lambda expression of comparator
        System.out.println(Arrays.toString(arr2)); //[4, 2, 1, -1, -3]

        //Integer[] -> Stream<Integer>
        List<Integer> sortedIntegers = Arrays.stream(arr2)//
        .sorted((i1, i2) -> i1 > i2 ? -1 : 1)//
        .collect(Collectors.toList());
        System.out.println(sortedIntegers);

        // Fruit
        List<String> fruits = Arrays.asList("orange", "apple", "orange", "lemon");
        Set<String> newFruits = fruits.stream().collect(Collectors.toSet());
        System.out.println(newFruits);

        // distinct() -> remove duplicates
        List<String> newFruits2 = fruits.stream().distinct().collect(Collectors.toList());
        System.out.println(newFruits2);
    }

    // Convert from List of Object A (more fields) to List of Object B (less fields)
    public static List<Book> getBookListForSearch(List<Book2> books){
        return books.stream()//
        .map(e -> new Book(e.getName()))//
        .collect(Collectors.toList());
    }

    public static class Book2 {
        private String name;
        private double price;

        public Book2(String name) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return this.name;
        }

        public double getPrice(){
            return this.price;
        }

        @Override
        public String toString() {
            return "Book[ " + "name = " + this.name + 
            "price = " + this.price + "]";

        }
    }

    public static class Book {
        private String name;

        public Book(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "Book[ " + "name = " + this.name + "]";

        }



    }
}
