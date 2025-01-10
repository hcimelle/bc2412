public class Product {
  // attributes
  private String name;
  private double price;
  private String productCode;

  // constructor
  public Product(String name, Double price, String productCode) {
    this.name = name;
    this.price = price;
    this.productCode = productCode;
  }

  // getter
  public String getName() {
    return this.name;
  }
  
  public double getPrice(){
    return this.price;
  }
  public String getProductcode(){
    return this.productCode;
  }

  //setter

  public void setName(String name){
    this.name = name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setProductcode(String productCode){
    this.productCode = productCode;
  }

  public static void main (String[] args) {

    Product p1 = new Product("A", 580.0, "001");
    Product p2 = new Product("B", 880.0, "002");
    Product p3 = new Product("C", 1180.0, "003");

    Product[] products = new Product[] {p1, p2, p3};
    for (Product p : products){
      System.out.println(p.getName() + ", "  + p.getPrice() + ", " + p.getProductcode());

    }

  }

}


