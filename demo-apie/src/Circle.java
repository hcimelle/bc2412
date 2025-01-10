import java.math.BigDecimal;

public class Circle extends Shape {
  private double radius;

  public Circle(Color color, double radius) {
    super(color);
    this.radius = radius;

  }

  public double areaOfCircle() {
    return BigDecimal.valueOf(this.radius)//
        .multiply(BigDecimal.valueOf(this.radius))//
        .multiply(BigDecimal.valueOf(Math.PI))//
        .doubleValue();
  }


  public static void main(String[] args) {
    Circle c1 = new Circle(Color.RED, 2.0);
    System.out.println(c1.areaOfCircle());
  }

}
