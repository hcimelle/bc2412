public class SelfExercise1 {
  public static void main (String[] args) {
/**
 * Expected Output:
 * 
 * I am going to add two numbers together:
 * The first one: 31
 * The second one: 42
 * The sum is 73
 * The subtraction reuslt is 11
 * The another sum result is 130
 * The variable varB is false
 * The variable varC is true
 * The variable fnumber is -130.2
 * The variable dnumber is -20.5
 * The variable reminder is 1
 * The variable result is 3
 */
int first = 31;
int second = 42;

System.out.println("The first one: " + first);
System.out.println("The second one: " + second);

int sum = first + second;

System.out.println("The sum is " + sum);

int subtract = 0;
if (first > second){
  subtract = first - second;
} else { 
  subtract = second - first;
}

System.out.println("The subtraction result is " + subtract);

// another sum
byte b1 = 60;
byte b2 = 70;
// code here with tips, pls fix ...
// sum = b1 + b2;
int theAnotherSum= b1 + b2;
System.out.println("The another sum reuslt is " + sum);

// declare two boolean variable with true and false value
// code here
boolean varB = false;
boolean varC = true;
System.out.println("The variable varB is " + varB);
System.out.println("The variable varC is " + varC);

// Reading Example
float fnumber = -130.20f; // By default, numbers are treated as double in Java.
// Use suffix 'f' with value to make it float.
double dnumber = -20.50;
System.out.println("The variable fnumber is " + fnumber);
System.out.println("The variable dnumber is " + dnumber);

// Find reminder. Declare variable a & reminder
int a = 7;
int b = 3;
// Fix it ...
int reminder = a % b;
System.out.println("The variable reminder is " + reminder);

// declare a variable x and assign value to it.
int e = 7;
int o = 8;
int y = 4;
int x = 2;
// code here ... define the x and assign value to it
int result = e - o * x / y;
System.out.println("The result is " + result);

  }
}