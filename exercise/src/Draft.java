
public class Draft {
    public static void main(String[] args) {
        System.out.println("First 10 numbers between 0 and 100 that are divisible by 2 and 3:");
        
        int count = 0; // To keep track of the number of printed numbers
        
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
                count++;
            }
            if (count == 10) {
                break; // Stop when we've printed 10 numbers
            }
        }
    }
}