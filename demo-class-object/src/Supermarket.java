public class Supermarket {
  private int availableStock;

  public Supermarket (int availableStock){
    this.availableStock = availableStock;

  }
public int getAvailableStock(){
  return this.availableStock;
}
public void setAvailableStock(int quantity){
  this.availableStock = availableStock;
}

   // public void restock(int numOfStock){
     // this.availableStock += numOfStock;
    //}

    //public void sold (int numOfStock){
     // this.availableStock -= numOfStock;
//}

public static void move(Supermarket from, Supermarket to, Worker worker, int quantity, boolean isMoveIn){
  //....
}

public static void main (String[] arg){
  //multiple supermarkets
  Supermarket s1 = new Supermarket(0);
    Worker worker1 = new Worker(s1);
    Worker worker2 = new Worker(s1);
    worker1.moveIn(30);
    worker2.moveOut(4);
    System.out.println(Worker.getWorkerCount()); //2


  }
}

