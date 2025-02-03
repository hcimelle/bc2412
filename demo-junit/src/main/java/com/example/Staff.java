package com.example;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// @ToString // Day 2
@EqualsAndHashCode

public class Staff {
  private String name;
  private int age;

  // Day 2
  @Override
  public String toString(){
    return this.name + " " + this.age;
  }


}
