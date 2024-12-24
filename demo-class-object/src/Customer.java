public class Customer { //person "has", name age,
  private long id;
  private Order[] orders;

  //contructor
  // 1. normally customer can be created without order
  //public Customer (long id, Order[] orders){
    //this.id = id;
    //this.orders = orders;
  //}
//}

public Customer(long id){
  this.id = id;
  this.orders = new Order[0];
}

//order id-> item[]
public Item[] getItem (long orderId){

}
//totalOrderAmount by order id
public double getTotalOrderAmount (long orderId)
//isVip() -> 100_000 (total amount for all orders)
public boolean isVip(){
  
}

//2. Customer can place order after creating the customer account
public void placeOrder(Order order){
//create new order array
Order[] newOrders = new Order[this.orders.length + 1];
for (int i = 0; i < this.orders.length; i++){
  newOrders[i] = this.orders[i];
}
newOrders[newOrders.length - 1] = order; 
this.orders = newOrders;
}

//get Orders

public long getId() { 
  return this.id;
}
public Order[] getOrders(){
 return this.orders;
}

public static void main(String[] args){
  Order[] orders = new Order[3];
  // orders[0] = new Order();
  // orders[1] = new Order();
  // orders[2] = new Order();
  Customer c1 = new Customer(1L);
     Customer c1 = new Customer(1L);
    c1.placeOrder(new Order());
    c1.placeOrder(new Order());
    c1.placeOrder(new Order());



}
}
