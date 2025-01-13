public class Cat extends Animal{
  private String color;

  public Cat (String name, int age, double weight, String color){
    super(name, age, weight);
    this.color = color;
  }

  @Override
  public String toString(){
    return super.getName() + " " + super.getAge() + super.getWeight() + this.color;
  }

  public void meow(){
    System.out.println("meow");
  }

  @Override
  public void eat(){
    System.out.println("cat is eating");
  }

  public void sleep(){

  }

  public void setName(String name){
    super.setName(name);
  }

  public static void main(String[] args) {
    
  }
}


