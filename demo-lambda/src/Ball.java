public class Ball {
  private int value;

  public Ball setValue(int value){
    this.value = value;
    return this.value;
  }

  public static void main(String[] args) {
    Ball ball = new Ball();
    ball = ball.addValue(3);
    ball = ball.addValue(4);
    System.out.println(ball.getValue());
  }
}
