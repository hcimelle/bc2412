public class Student {
  private int score;
  private char student;

  // Expected output:
  // 20 candies -> distribute to students according to their score until finish
  // rule: every round of distribution, above 80 score -> 2 candies ; 60-79 score -> 1 candy
  // Student 1: 67 score
  // Student 2: 89 score
  // Student 3: 50 score
  // Student 4: 99 score
  // Student 5: 60 score
  // Student 6: 59 score

  // expected output
  // 1 :1 ->2 ->3-> 4 Student 1 has 4 candies
  // 2: 2 ->4 ->6-> 6 Student 2 has 6 candies
  // 3: 0 ->0 ->0-> 0 Student 3 has 0 candies
  // 4: 2 ->4 ->6-> 6 Student 4 has 6 candies
  // 5: 1 ->2 ->3-> 4 Student 1 has 4 candies
  // 6: 0 ->0 ->0-> 0 Student 6 has 0 candies

  // tips: consider static, for loop (while loop?)

  public Student(int score, char student) {
    this.score = score;
    this.student = student;
  }

    public char getStudent(){
      return this.student;
    }
    
public static void main (String[] args){
Student[] students

    int numOfC = 0;
    int totalC = 20;



    for (int i = 0; i <= 6; i++) {
      if (score >= 80) {
        numOfC += 2;
      } else if (score <= 79 && score >= 60) {
        numOfC += 1;
      } else {
        numOfC += 0;
      }
    }

      System.out.println("Student 1 has " +  + "candies");
      System.out.println("Student 2 has " +  + "candies");
      System.out.println("Student 3 has " +  + "candies");
      System.out.println("Student 4 has " +  + "candies");
      System.out.println("Student 5 has " +  + "candies");
      System.out.println("Student 6 has " +  + "candies");
    }
  



// question 2: (Student2.class to store his own candies)
// Candy.class has attribute color (RED, BLUE, YELLOW)
// 20 candies -> distribute to students according to their score until finish
// rule: every round of distribution, above 80 score -> red ; 60-79 score -> blue; else yellow;
// Student 1: 67 score
// Student 2: 89 score
// Student 3: 50 score
// Student 4: 99 score
// Student 5: 60 score
// Student 6: 59 score

// expected output: return Student[] (student should have candy attribute)
