public class DemoForLoop {
  public static void main(String[] args) {
    // 2^100
    int x = 2;
    x = x * 2;
    x *= 2;
    System.out.println(x);

    // For loop
    // ! for ( initialisation ; condition ; modifier
    // ) { }


    // "i = 3" -> contine criteria
    // "i++" -> modifier
    // ! you have to let the modifierwork with "continue criteria",
    // ! so that the continue criteria at the end become false
    for (int i = 0; i < 3; i++) { // 0,1,2 or 3-0
      System.out.println("hello");
    }
    // step 1 : int i = 0;
    // step 2 : i < 3 (question) -> true
    // step 3 : if true, print hello
    // step 4 : i++, i become 1
    // step 5 : i < 3 (question) -> true
    // step 6 : if true, print hello
    // step 7 : i++, i become 2
    // step 8 : i < 3 (question) -> true
    // step 9 : if true, print hello
    // step 10 : i++, i become 3
    // step 11 : i < 3 (question) -> false
    // step 12 : exit for loop

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // print even numbers
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) { // even number defintion
        System.out.println(i);
      }
    }

    // print 0-100 divisible by 3 and 4
    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0 && i % 4 == 0) {
        System.out.println(i);
      }
    }

    // sum up 0 - 20: 0+1+2+..+20
    int sum = 0;
    for (int i = 0; i < 21; i++) {
      sum += i;
    }
    System.out.println(sum); // 210
    // System.out.println(i); // ! i is declared within the for loop

    // sum up all odd number between 0-10
    int sum1 = 0;
    for (int i = 0; i <= 10; i++) {
      if (i % 2 != 0) {
        sum1 += i;
      }
    }
    System.out.println(sum1); // 25

// sum up all odd numbers betwen 0 - 10
    // sum up all even numbers betwen 0 - 10
    // ! Find the diffenece betwen evenSum and oddSum -> positive number
    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        oddSum += i;
      } else {
        evenSum += i;
      }
    }
    // int diff = -1;
    // if (oddSum > evenSum) {
    //   diff = oddSum - evenSum;
    // } else {
    //   diff = evenSum - oddSum;
    // }
    int diff = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
    System.out.println(diff); // 5

    // Searching
    String str = "abcdefijk";
    // 1. Check if 'd' exists in the string.
    // for loop + if + charAt
    boolean found = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'd') {
        found = true;
        break; // break the nearest loop
      }
    }
    System.out.println(found);
    // Test Case:
    // 1. "abcdefijk"
    // 2. "abcefijk"
    // 3. ""
    // 4. "abcdefijkd"

    // 2. check if the string value contains given sub-string
    String substr = "lo";
    String str2 = "hello";
    // hel vs loq
    // ell vs loq
    // llo vs loq

    // for loop + substring
    boolean isSubstringExist = false;
    for (int i = 0; i < str2.length() - substr.length() + 1; i++) {
      if (str2.substring(i, i + substr.length()).equals(substr)) {
        isSubstringExist = true;
        break;
      }
    }
    System.out.println(isSubstringExist); // true
  }
}