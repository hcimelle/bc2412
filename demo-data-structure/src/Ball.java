import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball> {
  private Color color;
  private int value;

  public static enum Color {
    RED, YELLOW, BLUE;
  }

  public Ball(Color color, int value) {
    this.color = color;
    this.value = value;

  }

  public Color getColor() {
    return this.color;
  }

  public int getValue() {
    return this.value;

  }

  @Override
  public int compareTo(Ball ball) {
    // Compare two balls
    // this.ball (-1), ball (1)
    // order by color : RED, BLUE, YELLOW, for same color, descending order of value
    if (this.color == ball.getColor()){
      if (this.value > ball.getValue())
      return -1;
    else
      return 1;
    }
    if (this.color == Color.RED)
      return -1;
    if (ball.getColor() == Color.RED)
      return 1;
    if (this.color == Color.BLUE)
      return -1;
    return 1;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void setValue(int value) {
    this.value = value;

  }

  @Override
  public String toString() {
    return "Ball[" + "color =" + this.color + " value =" + this.value + "]";
  }

  public static void main(String[] args) {
    // Ball List
    // RED 1
    // YELLOW 9
    // BLUE 7
    // YELLOW 3
    // RED 8

    List<Ball> balls = new LinkedList<>();
    Ball ball1 = new Ball(Ball.Color.RED, 1);
    balls.add(ball1);
    Ball ball2 = new Ball(Ball.Color.YELLOW, 9);
    balls.add(ball2);
    Ball ball3 = new Ball(Ball.Color.BLUE, 7);
    balls.add(ball3);
    Ball ball4 = new Ball(Ball.Color.YELLOW, 3);
    balls.add(ball4);
    Ball ball5 = new Ball(Ball.Color.RED, 8);
    balls.add(ball5);
    System.out.println(balls);

    // Sort by Values
    //Approach 1 : Comparable<Ball> (Disadvantage: one rule for sort)
    Collections.sort(balls); // Ball Class comply with the contract of Collection.sort()
    System.out.println(balls); 
    //[Ball[color =RED value =8], Ball[color =RED value =1], 
    // Ball[color =BLUE value =7], Ball[color =YELLOW value =9], Ball[color =YELLOW value =3]]
    
    //Approach 2 : Comparator<Ball> (Better design)
    Comparator<Ball> sortFormula;
    int x = 1;
    if (x > 2){
     sortFormula = new SortByColor();
    } else {
      sortFormula = new SortByValue();
    }
    Collections.sort(balls, sortFormula);
    System.out.println(balls);
  }
}


