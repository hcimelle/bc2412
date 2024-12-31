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
  //1 :1 -> 4
  //2: 2 -> 6
  //3: 0 -> 0
  //4: 2 -> 6
  //5: 1 -> 4
  //6: 0 -> 0

  // tips: consider static, for loop

  public Student (int score, char student){
    this.score = score;
    this.student = student;

    int numOfC = 0;
    int totalC = 20;
    for (int i=0; i <=6; i++){
    if (score >= 80){
    numOfC += 2;
    } else if (score <=79 && score >=60){
    numOfC +=1;
    } else {
      numOfC +=0;
    }
    System.out.println("1 : " + numOfC );
    System.out.println("2 : " + numOfC );
    System.out.println("3 : " + numOfC );
    System.out.println("4 : " + numOfC );
    System.out.println("5 : " + numOfC );
    System.out.println("6 : " + numOfC );
  }



  }
}
