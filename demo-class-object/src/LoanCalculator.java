import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanCalculator {
  private double principle;
  private double annualInterestRate;
  private int numOfYears;

  //constructor

  public LoanCalculator(double principle, double annualInterestRate, int numOfYears){
    this.principle = principle;
    this.annualInterestRate = annualInterestRate;
    this.numOfYears = numOfYears;
  }

  public double totalInterestAfterYears(){
    return BigDecimal.valueOf(this.principle)//
    //principle * (1+(annualInterestRate/100)^numberOfyears)
    .multiply(BigDecimal.valueOf(Math.pow(1+this.annualInterestRate/100,this.numOfYears)))//
    .setScale(2,RoundingMode.HALF_DOWN)//
    .subtract(BigDecimal.valueOf(this.principle))//
    .doubleValue();
  }

  public static double totalInterestAfterYears2 (double principle, double annualInterestRate, int numOfYears) {
    return BigDecimal.valueOf(principle)//
    .multiply(BigDecimal.valueOf(Math.pow(1+annualInterestRate/100, numOfYears)))//
    .setScale(2,RoundingMode.HALF_DOWN)//
    .subtract(BigDecimal.valueOf(principle))//
    .doubleValue();
  }

  public static void main(String[] args) {
    LoanCalculator l1 = new LoanCalculator(10000, 2.0, 2);
    System.out.println(l1.totalInterestAfterYears());
    System.out.println(totalInterestAfterYears2(10000, 2.0, 2));
  }
}
