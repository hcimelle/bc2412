public class DemoOperator {
  public static void main (String[] args) {

    // + 1
    int x = 3;
    x = x + 1;
    x++;
    ++x;
    x += 1; // += means x = x 
    System.out.println(x); // 7

    // - 1
    int y = 3;
    y = y - 1;
    y--;
    --y;
    y -= 1;
    System.out.println(y); // -1

    // + 2
    int b = 20;
    b = b + 2;
    b += 2;
    System.out.println(b); // 24

    // - 2
    int c = 20;
    c = c - 2;
    c -= 2;
    System.out.println(c); // 16

    // *=, /=
    int m = 5;
    m = m * 2;
    m *= 2;
    System.out.println(m); // 20

    int u = 4;
    u = u / 2;
    u /= 2;
    System.out.println(u); // 1

    int remainder = 10 % 3;
    System.out.println(remainder); // 1

    // ++x vs x++
    int a = 8;
    int result1 = ++a + 3;
    System.out.println(result1); //12
    // step 1: a become 9
    // step 2: a + 3 ( 9 + 3)
    // step 3: assign 12 to result

    int q = 8;
    int result2 = q++ + 3;
    System.out.println(result2); // 11
    System.out.println(q); // 9
    // step 1: q + 3 = 8 + 3
    // step 2: q become 9
    // step 3: assign 11 to result2

    // String +=
    String s = "hello";
    s += "!";
    System.out.println(s); // hello
    // int + double -> double
    // String + anything -> String

    s += "a";
    System.out.println(s); // hello!a

    s += 1;
    System.out.println(s); // hello!a1

    s += true;
    System.out.println(s); // hello!a1true

    int x10 = 5;
    int y10 = 10;
    int z10 = x10 += 3 * y10; // !!! ng ho gum se code!
    System.out.println(z10); // 35

    int x11 = 3;
    int y11 = (x11++ +3) * x11++;
    System.out.println(y11); // 24
    System.out.println(x11); // 5
    // step 1: 3+3
    // step 2: x11 become 4
    // step 3: 6 * 4
    // step 4: x11 become 5
    

    int x12 = 3;
    int y12 = (x12++ +3) * ++x12;
    System.out.println(y12); // 30
    System.out.println(x12); // 5
  }
}
