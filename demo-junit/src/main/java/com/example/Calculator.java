package com.example;
public class Calculator {
  
  //method A -> method B
  //method B -> sum()
  //sum() -> method C

public static int methodB(int a){
  return a + sum(a , a + 2);
}

  public static int sum (int x, int y){
    // return x + y; // day 1
    return x + y + 1; // day 2
  }
}
