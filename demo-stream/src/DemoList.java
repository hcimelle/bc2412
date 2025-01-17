import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
  public static void main(String[] args) {
    //ArrayList<>()
    //List.of()
    //Arrays.asList()


    // 1. new ArrayList<>()
    // able to add /remove/ modify
    List<String> strings1 = new ArrayList<>();
    strings1.add("ABC");
    strings1.add("DEF");

    List<String> strings2 = new ArrayList<>(Arrays.asList("ABC","DEF"));
    strings2.add("IJK");
    strings2.remove("DEF");
    strings2.set(0,"XYZ");

    // 2. Arrays.asList()
    // Cannot to add and remove ONLY. modify element
    List<String> strings3 = Arrays.asList("ABC","DEF","IJK");
    //strings3.add("XYZ");
    // strings3.remove("IJK");
    strings3.set(0, "OPQ");

    // 3. List.of()
    // Able to read Only.
    List<String> strings4 = List.of("ABC","DEF","IJK");
    // strings4.add("XYZ");
    // strings4.remove("ABC");
    // strings4.set(0,"LLL");
    System.out.println(strings4.get(2)); //IJK


  }
}
