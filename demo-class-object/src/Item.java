import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {
private String name;
private double price;
private int quantity;

  //constructor
public Item(String name, double price, int quantity){
  this.name = name;
  this.price = price;
  this.quantity = quantity;
}

  //getter
  public String getName(){
    return this.name;
  }
public double getPrice() {
    return this.price;
  }
  public int getQuantity() {
    return this.quantity;
  }

//setter

public void setName(String name){
  this.name = name; // no need IRL
}
public void setPrice(double price){
  this.price = price; // no need IRL
}
public void setQuantity(int quantity){
  this.quantity = quantity; // may need IRL
}

public double totalAmount(){
  return BigDecimal.valueOf(this.price) //
        .multiply(BigDecimal.valueOf(this.quantity))//
        .setScale(2,RoundingMode.HALF_UP) //
        .doubleValue();
}

public static void main(String[] args){
  Item i1 = new Item("A", 10, 10);
  System.out.println(i1.totalAmount());

  }

}



