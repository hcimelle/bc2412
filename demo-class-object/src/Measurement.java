import java.math.BigDecimal;
import java.math.RoundingMode;

public class Measurement {
  // attributes
  private double height; // instance variable
  private double weight; // instance variable

  // constructor
  public Measurement(double height, double weight) {
    this.height = height;
    this.weight = weight;
  }

  public double bmi() {
    return BigDecimal.valueOf(this.weight)//
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
            RoundingMode.HALF_DOWN)//
        // .setScale(2,RoundingMode.HALF_DOWN)// for other operation, + , -, *
        .doubleValue();
  }

  // instance method
  // able to call obhect attribute and instance method
  public String bmiIndex() {
    double bmiValue = this.bmi();
    if (bmiValue >= 35.0) {
      return "Extremely Obese";
    } else if (bmiValue >= 30.0 && bmiValue < 35.0) {
      return "Obese";
    } else if (bmiValue >= 25.0 && bmiValue < 30.0) {
      return "Overweight";
    } else if (bmiValue >= 18.5 && bmiValue < 25.0) {
      return "Normal";
    } else {
      return "Underweight";
    }
  }
}

public static double bmi(double height, double weight) {
  return BigDecimal.valueOf(weight)//
      .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2,
          RoundingMode.HALF_DOWN)//
      // .setScale(2,RoundingMode.HALF_DOWN)// for other operation, + , -, *
      .doubleValue();
}

public static void main(String[] args) {
  // BMI
  Measurement m1 = new Measurement(1.74, 68);
  System.out.println(m1.bmiIndex); // normal

  System.out.println(m1.bmi()); // non-terminating decimal expansion;

  System.out.println(Measurement.bmi(1.74, 68));
}
