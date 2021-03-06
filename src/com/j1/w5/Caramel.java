package com.j1.w5;

public class Caramel extends CondimentDecorator {
  Beverage beverage;
  
  public Caramel(Beverage beverage) {
    this.beverage=beverage;
  }
  public String getDescription() {
    return beverage.getDescription()+", Caramel";
  }
  public double cost() {
    return .15+beverage.cost();
  }
}