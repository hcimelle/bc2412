public class Selfexercise {
  public static void main (String [] args) {
        // sum up all even numbers between 0-10
    // find the difference between evenSum and oddSum -> positive number
    int oddSum = 0; 
    int evenSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 ==1) {
        oddSum += i;
      } else {
        evenSum += i;
     }
    }
     int diff = -1;
     if (oddSum > evenSum) {
     diff = oddSum - evenSum;
      } else {
     diff = evenSum - oddSum;
    }
    diff = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
     System.out.println(diff); // 5
    }
    
  }
