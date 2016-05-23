package com.j1.w12;

import java.util.ArrayList;
import java.util.Arrays;

public class DuckSortTestDrive {
  public static void main(String[] args) {
    Duck[] ducks={new Duck("A",1), new Duck("B",2), new Duck("C",3)};
    
    System.out.println("Before sorting:");
    display(ducks);
    
    Arrays.sort(ducks);
    
    System.out.println("\nAfter sorting:");
    display(ducks);
  }
  
  public static void display(Duck[] ducks) {
    for (int i=0; i<ducks.length; i++) {
      System.out.println(ducks[i]);
    }
  }
}

      