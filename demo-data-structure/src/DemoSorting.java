import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {

  public static void changeCatName(Cat cat) {
    cat.setName("Jerry");
  }

  public static void main(String[] args) {
    // bubble sort (nested loop)

    List<Integer> integers = Arrays.asList(1, 3, 10, -4, 2);
    Collections.sort(integers); //pass by reference
    System.out.println(integers); // [-4, 1, 2, 3, 10]

    int[] arr = new int[] {10, 2, 9};
    allZero(arr);
    System.out.println(Arrays.toString(arr)); // [0, 0, 0]

    // in Java, array & all custum types are always pass by reference
    // primitive, wrapped class, String are always pass by value (a copy of value)


    // Primitives of Wrapper Class
    int a = 3;
    int b = 4;
    System.out.println(sum(a, b)); // 300, passing a copy of values to the method
    System.out.println(a); // 3, but not 100, bc we pass by value for primitives
    System.out.println(b); // 4, but not 200, bc we pass by value for primitives
    //Sort String by Collections.sort()

    BigDecimal bd1 = BigDecimal.valueOf(10);
    BigDecimal bd2 = BigDecimal.valueOf(3);
    System.out.println(addBigDecimal(bd1, bd2).doubleValue()); //13.0
    System.out.println(bd1.doubleValue());//
    System.out.println(bd2.doubleValue());//

    Cat cat1 = new Cat("Jack", 2, 4.0, "Black");
    changeCatName(cat1);
    System.out.println(cat1);
  }

  public static int sum(int a, int b) { 
    a = 100;
    b = 200;
    return a + b;
  }

  public static String concat(String x, String y) {
    return x.concat(y);
  }

  // overflow -> int * int -> int
  // long * long -> long -> Long
  public static long multiply(int x, int y) {
    return (long) x * (long) y; // avoid overflow
  }

  public static void allZero(int[] arr) { // pass by object reference
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 0;
    }


  }
  // Big Decimal? pass by value OR pass by reference
  // Similar to String
  public static BigDecimal addBigDecimal(BigDecimal original, BigDecimal delta){
    //can you revise the value inside a BigDecimal Object? 
    return original.add(delta); // always return a new BigDecimal Object

}

}

