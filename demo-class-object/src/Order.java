import java.math.BigDecimal;

public class Order {
  private long id;
  private Item[] items;


  //constructor
  public Order(long id, Item[] items) {
    this.id = id;
    this.items = new Item[]{ };

  }

  public void addItem(Item item){
  }
  public void removeItem (Item item){
  }

  //getter
public long getId() { 
  return this.id;
}
public Item[] getItems(){
 return this.items;
}


public double totalAmount(){
  return BigDecimal.valueOf(this.items)) 
}

public static void main(String[] args){

}
  }

