import java.math.BigDecimal;

public class Square extends Shape{
  private double length;

  public Square (String color, double length){
    super(color);
    this.length = length;
  }
  public double areaOfSquare(){
    return BigDecimal.valueOf(this.length)//
    .multiply(BigDecimal.valueOf(this.length))//
    .doubleValue();
  }

  public static void main(String[] args) {
    Square s1 = new Square("blue",2.0);
    System.out.println(s1.areaOfSquare());
  }
  }
  

