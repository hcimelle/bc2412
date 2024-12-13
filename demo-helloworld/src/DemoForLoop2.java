public class DemoForLoop2 {
  public static void main(String[] args) {

    // Counting


    // Count the number of 'l'
    // for + if
    String s = "hello";
    int count = 0;
    for (int i = 0; i < s.length(); i++) { // loop all values + filtering
      if (s.charAt(i) == 'l') {
        count++;
      }

    }
    System.out.println(count);

    // continue - skip the rest, go to next iteration
    count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != 'l') {
        continue; // skip count++, go to i++
      }
      count++;
    }
    System.out.println(count);

    // 1 - 100, print all numbers, which can be divided by 3 and 4
    // USE continue
    
    for (int i = 1; i < 101; i++){
      if (i % 3 != 0 || i % 4 != 0) {
        continue;
      }
      System.out.println(i);
    }
    

    }
  }


