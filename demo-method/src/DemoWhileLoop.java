import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
  /**
   * @param args
   */
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println(i);
    }

    // while loop vs for loop
    int j = 0; // ! 1. declare the counter outside the loop
    while (j < 3) { // continue criteria
      System.out.println(j);
      j++; // ! 2. flexible to control the j
      j++;
      j++;
    }

    String s = "hello";
    char target = 'e';
    boolean found = false;
    // for
    for (int i = 0; i < s.length() ; i++){
      if (s.charAt(i) == target){
        found = true;
        break;
      }
    }

    int k = 0;
    
    while (k < s.length()) {
      if (s.charAt(k) == target) {
        found = true;
        break;
      }
      k++;
    }
    System.out.println(found);

    // random
    int number = new Random().nextInt(3); // 0-2
    System.out.println(number);

    int markSix = new Random().nextInt(49) + 1; // 0-48 +1
    System.out.println(markSix);

    int marksixArr[] = new int[6];
    int count = 0;
    int value = new Random().nextInt(49) + 1; // 1-49
    while (count < 6) {
    if (!isDuplicated(marksixArr, value)){
      marksixArr[count] = value;
      count++;
    }     
    }
    System.out.println(Arrays.toString(marksixArr));
  

// 1- 100
// bomb : 47

//! game starts:
//please pick a number between 1-100;
//user: 4
//please pick a number between 5-100;
//user: 67
//please pick a number between 5-66
//user: 47
//print: bomb!

//while, scanner, random
    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(max) + 1; // 1-100
    int input = -1;
    Scanner scanner = new Scanner(System.in);
    while (bomb != input) {
      System.out.println("Please pick a number between " + min + "-" + max);
      input = scanner.nextInt();
      //min, max
      if (input < min || input > max)
      continue;
      if (input < bomb) {
        min = input + 1;
       } else { 
          max = input - 1;
        }
      }
      scanner.close();
    }

  // check if duplicated exists
  public static boolean isDuplicated(int[] arr, int newValue) {
    // code here...
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == newValue)
        return true;
    }
    return false;


  }
}
