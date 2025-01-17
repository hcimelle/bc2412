
public class Draft {
    /**
     * Expected output:
     * The index of the last character of c is 11
     */
    public static void main(String[] args) {
      String str = "coding bootcamp."; // You should not change this line
      char target = 'c'; // Update this target to test the logic
  
      // if not found, print "Not Found."
      // code here ...
  
      System.out.println("The index of last character of " + target + " is " + str.lastIndexOf("c"));
       
    
      String s8a = "abcba";
      String s8b = "cba";
      boolean isSubstring = false ; {
    
      for(int i = 0; i < s8a.length()-s8b.length() + 1; i++) {
        if (s8a.substring(i, i + s8b.length()).equals(s8b)) {
          isSubstring = true;
          break;
        }
      }
      System.out.println(isSubstring);
    
    
      }
    
      int counter = 10;

      for (byte i=0; i<128; i--){
        counter++;
      }
    System.out.println(counter);
    }



        }

  
  