public class DemoInnerClass { // outer class
  private int x;

  public void setX (int x) {
    this.x = x;
  }

  public void print() {
    // Outer class cannot read the inner class object attribute
    //System.out.println("Outer.print():" + "x=" + this.x + "y=" + y);
    System.out.println("Outer.print():" + "x=" + this.x);
  }

  public static class Library {
  }

  public class Student { // inner class
    private int y;

    public void print(){
      // Student object is able to read outer class object attributed directly
      System.out.println("Student.print():" + "x=" + x + "y=" + this.y);
    }

    public void setY (int y) {
      this.y = y;
    }

  }

  public static void main(String[] args) {
    DemoInnerClass.Library library = new DemoInnerClass.Library();
    DemoInnerClass dic = new DemoInnerClass();
    DemoInnerClass.Student student = new DemoInnerClass().new Student(); // NOT Parent-Child relationship
 
    dic.setX(10);
    student.setY(20);
    System.out.println(dic);

    
  }

}
