public class Product {
  // attributes
  private String name;
  private int price;
  private String code;

  // constructor
  public Product(String name, int price, String code) {
    this.name = name;
    this.price = price;
    this.code = code;
  }

  // getter
  public String getName() {
    return this.name;
  }
  public int getPrice(){
    return this.price;
  }
  public String getCode(){
    return this.code;
  }

  public static void main (String[] args) {

    Product p1 = new Product("A", 580, "001");
    Product p2 = new Product("B", 880, "002");
    Product p3 = new Product("C", 1180, "003");

    Product[] products = new Product[] {p1, p2, p3};
    for (Product p : products){
      System.out.println(p.getName() + ", "  + p.getPrice() + ", " + p.getCode());

    }

  }

}


