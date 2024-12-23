import java.math.BigDecimal;

public class Circle {
  private double radius;
  // private String color;

  // constructor
  public Circle(double radius) {
    this.radius = radius;

  }

  // getter
  public double getRadius() {
    return this.radius;
  }

  // setter
  public void setRadius(double radius){
    this.radius = radius;
  }

  //instance method
  public double calculateArea(){
    return BigDecimal.valueOf(this.radius) //
    .multiply(BigDecimal.valueOf(this.radius)) //
    .multiply(BigDecimal.valueOf(Math.PI)) //
    .doubleValue();
  }
  
  //static method: CANNOT call "this"
  //design definition: (input-> output)
  public static double calculateArea2(double radius){
    return BigDecimal.valueOf(radius) //
    .multiply(BigDecimal.valueOf(radius)) //
    .multiply(BigDecimal.valueOf(Math.PI)) //
    .doubleValue();

  }

public static void main (String[] args) {
//area
//use BigDecimal
Circle c1 = new Circle (3.0);

System.out.println(c1.calculateArea()); // 28.274333

//Formula
System.out.println(Circle.calculateArea2(3.0)); // 28.274333

  Circle [] circles = new Circle[] {c1};
  for (Circle c : circles){
System.out.println();
  }

  }
}

