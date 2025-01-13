public class NewExercise {

  public static boolean isEven(int x) {
    if (x % 2 == 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int num = 21;
    System.out.println(isEven(99));
    System.out.println(isEven(num));
  }
}
