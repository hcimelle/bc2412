import java.math.BigDecimal;

public class Order {
  private long id;
  private Item[] items; //address / object reference -> item array object

  //constructor
  public Order(long id) {
    this.id = id;
    this.items = new Item[]{ };

  }

  public void addItem(Item item){
    Item[] newArr = new Item[this.items.length + 1];
    for (int i = 0 ; i < this.items.length; i++) {
      newArr[i] = this.items[i];
    }
    newArr[newArr.length - 1] = item;
    this.items = newArr;
  }

  public void removeItem(Item item) {
    // resize array - 1
    // this.items -> Item array object
    // this.items[i] -> Item Object
    Item[] newArr = new Item[this.items.length - 1];
    int idx = 0;
    int countTarget = 0;
    for (int i = 0; i < this.items.length; i++) {
      if (this.items[i].equals(item) && countTarget == 0) { // TBC.
        countTarget++;
        continue;
      }
      newArr[idx++] = this.items[i]; // copy
    }
    this.items = newArr;
  }

  //getter
public long getId() { 
  return this.id;
}
public Item[] getItems(){
 return this.items;
}

// Order order = new Order(items);
// order.totalAmount();
public double totalAmount(){
  //0.0 + 10.3 (new BigDecimal object)-> 10.3 (new BigDecimal object)
  //10.3 + 7.7 (new BigDecimal object)-> 18.0 (new BigDecimal object)
  BigDecimal total = BigDecimal.valueOf(0.0);
  for (Item item: items) {
    total = total.add(BigDecimal.valueOf(item.totalAmount()));
  }
return total.doubleValue();
}

public static void main(String[] args){

}
  }

