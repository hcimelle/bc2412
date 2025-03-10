public class DemoMethod {

    // ! sum(int x, int y) -> input parameters
    // ! int -> return type
    // ! "sum(int x , int y)" -> method signature
    public static int sum(int x, int y) {
        int result = x + y;
        return result;
    }
    // the return value should align the return type


    // ! Java doesn't allow "different type" for the same method signature
    // public static long sum(int x, int y)

    // ! Not Allowed: Same method signature
    // "sum(int a , int b)" = sum(int x, int y)
    // Same method name + Same Parameter List
    // public static double sum(int a, double b) {
    // return 1;
    // }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static double subtract(double a, int b) {
        return a + b;
    }

    public static double sum(int a, String b) {
        return a + Integer.valueOf(b); // int + int -> int -> double
    }

    public static double subtract(double vincent, double lucas) {
        return vincent - lucas;
    }


    // source -> hello
    // target 'l'
    // return 2

    public static int countCharacter(String source, char target) {
        int count = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }


    public static int totalMinutes(int day) {
        int minutes = 0;
        for (int i = 0; i < day; i++) {
            for (int j = 0; j < 24; j++) {
                minutes += 60;
            }
        }
        return minutes;
    }

    public static int countEven(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int countEven(long[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int x = 3;
        int a = 10;
        int b = 11;
        int y = a + b;
        System.out.println(y); // 21
        a = 19;
        b = 21;
        y = a + b;
        System.out.println(y); // 40

        // call sum() method
        y = sum(10, 11);
        System.out.println(y); // 21
        y = sum(19, 21);
        System.out.println(y); // 40

        // call subtract() method

        System.out.println(subtract(100, 98)); // 100.0 - 98.0 -> 2.0

        // call countCharacter() method

        System.out.println(countCharacter("hello", 'l'));


        sum(1, 2.0); // sum(int x, double y)
        sum(1, 2); // sum(int x, int y)
        // sum(1.0, 2); //sum(double x , int y)
        System.out.println(sum(2, "123")); // 125


        System.out.println(countEven(new long[] {1L, 3L, 2L, 6L})); //2
        System.out.println(countEven(new int[] {1, 3, 2, 6})); // 2
    }
}


