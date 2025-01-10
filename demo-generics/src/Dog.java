public class Dog extends Animal{
 

  public Dog (String name, int age, double weight){
    super(name,age,weight);
  }

  @Override
  public String toString(){
    return super.getName() + " " + super.getAge() + super.getWeight();
  }

  public void eat(){
    System.out.println("dog is eating");
  }
}
