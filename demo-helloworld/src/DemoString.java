public class DemoString {
  public static void main (String[] args) {
    char x = 'a';
    x = 1; //!????
    // x = 1.1; cannot
    // x = true; cannot
    x = 'x';
    // char x = 'o'; cannot

    // char x = "abcde1234" cannot

    // ! define a String value by double quote ""
    // ! define a char value by single quote ''
    String password = "abcd1234";
    String emailAddress = "abc@gmail.com";
    
    // + operation
    password = password + "!";
    System.out.println("helloworld");
    System.out.println(password); // abcd1234!

    // Java Method (Instance method)
    // action / tools

    char result = password.charAt(0); 
    // 0 represents the first position of the string value
    System.out.println(result); // a

    // ! index starts from 0 to length - 1 
    System.out.println(password.charAt(8)); // !
    // System.out.println(password.charAt(-1)); // error
    // System.out.println(password.charAt(9)); // error

    // equals()
    String s1 = "abc";
    String s2 = "abc";
    boolean result2 = s1.equals(s2);
    System.out.println(result2); // true
    
    // equals () -> false
    String s3 = "def";
    String s4 = "ghi";
    boolean result3 = s3.equals(s4);
    System.out.println(result3); // false

    // length ()
    // password.length();
    int result4 = password.length();
    System.out.println(result4); // 9 , the length of String value
    
    
  }
}