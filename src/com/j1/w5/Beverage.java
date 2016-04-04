package com.j1.w5;

public abstract class Beverage {
  String description="Unknown Beverage";
  
  public String getDescription() {
    return description;
  }
  
  public abstract double cost();
}