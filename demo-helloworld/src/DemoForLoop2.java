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

    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 && i % 4 != 0 // event 1
          || i % 3 != 0 && i % 4 == 0 // event 2
          || i % 3 != 0 && i % 4 != 0 // event 3
      ) {
        continue;
      }
      System.out.println(i);
    }

    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0 && i % 4 == 0) {
        System.out.println(i);
      }
    }

    // Nested Loop
    for (int i = 0; i < 3; i++) { // outer loop
      // i = 0
      for (int j = 0; j < 4; j++) { // inner loop
        // System.out.println('*'); // print and next line
        System.out.print('*');
      }
    }
    System.out.println();

    // Step 1 : i = 0, j = 0, print *
    // Step 2 : i = 0, j = 1, print *
    // Step 3 : i = 0, j = 2, print *
    // Step 4 : i = 0, j = 3, print *
    // Step 5 : i = 1, j = 0, print *
    // Step 6 : i = 1, j = 1, print *
    // Step 7 : i = 1, j = 2, print *
    // Step 8 : i = 1, j = 3, print *
    // Step 9 : i = 2, j = 0, print *
    // Step 10 : i = 2, j = 1, print *
    // Step 11 : i = 2, j = 2, print *
    // Step 12: i = 2, j = 3, print *

    // *
    // **
    // ***
    // ****

    int n = 4;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // *
    // ***
    // *****
    // *******

  }
}


