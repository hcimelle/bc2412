import java.math.BigDecimal;

public class Triangle extends Shape {
  private double base;
  private double height;

  public Triangle(String color, double base, double height) {
    super(color);
    this.base = base;
    this.height = height;

  }

  public double areaOfTriangle() {
    return BigDecimal.valueOf(this.base)//
        .multiply(BigDecimal.valueOf(this.height))// .
        .multiply(BigDecimal.valueOf(0.5))//
        .doubleValue();
  }

  public static void main(String[] args) {
    Triangle t1 = new Triangle("Yellow", 2.0, 3.0);
    System.out.println(t1.areaOfTriangle());
  }
}
