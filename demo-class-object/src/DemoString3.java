public class DemoString3 {
  public static void main (String[] args){
    String s = "hello"; // Literal pool
    String s2 = "hello"; // Literal pool
    String s3 = s; //s3 and s pointing same object
    String s4 = "hello!";
    String s5 = new String ("hello");
    String s6 = String.valueOf("hello"); //leverage literal pool
    String s7 = new String ("hello");

    // identityHashCode -> Object reference (address)
    System.out.println(System.identityHashCode(s)); //1933863327
    System.out.println(System.identityHashCode(s2));//1933863327
    System.out.println(System.identityHashCode(s3));//1933863327
    System.out.println(System.identityHashCode(s4));//112810359
    System.out.println(System.identityHashCode(s5));//2124308362
    System.out.println(System.identityHashCode(s6));//1933863327
    System.out.println(System.identityHashCode(s7));//146589023

    // equals(), ==
  
    // If you use "==" for non-primitive, you are checking the object reference
    // Besides, s.equals() is checking the String value itself
    System.out.println(s == s2);//true
    System.out.println(s.equals(s2)); //true

    System.out.println(s5 == s7);//false
    System.out.println(s.equals(s5)); //true



    // String is immutable (purpose: reduce risk)
    
    //Question : after appending "?", is "s" still the same object?
    s = s + "?";
    System.out.println(System.identityHashCode(s));//349885916

  }
  
}
