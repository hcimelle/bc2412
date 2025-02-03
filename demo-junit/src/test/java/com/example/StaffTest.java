package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// !Test Java File name should be with "Test" or "Tests" suffix
class StaffTest {
  @Test
  void testStaff_GetSetter(){
  Staff s1 = new Staff();
  s1.setAge(18);
  Assertions.assertEquals(18,s1.getAge());
    
  }

  @Test
  void testStaff_Constructor(){
    Staff s2 = new Staff("john", 19);
    Assertions.assertEquals("john", s2.getName());
    Assertions.assertEquals(19, s2.getAge());
  }

  @Test

  void testStaffList(){
    Staff s1 = new Staff("Steven", 30);
    Staff s2 = new Staff("Steven", 30);
    Assertions.assertEquals(s1, s2);
  }

  @Test

  void testStaffToString(){
    Staff s1 = new Staff("Steven", 30);
    //Assertions.assertEquals("Staff[name=Steven, age=30]", s1.toString());
    Assertions.assertEquals("Steven 30", s1.toString());
  }
}
