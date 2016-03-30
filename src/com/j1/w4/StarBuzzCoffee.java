package com.j1.w4;

abstract class Beverage  {
  String description = "Unknown Beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}

abstract class Espresso extends Beverage {
  public Espresso() {
    description="Espresso";
  }
  public double cose() {
    return 1.99;
  }
}

class DarkRoast extends Beverage {
  public DarkRoast() {
    description="Dark Roast Coffee";
  }
  public double cost() {
    return .99;
  }
}

class Mocha extends CondimentDecorator {
  Beverage beverage;
  public Mocha(Beverage b) {
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription() + ",Mocha";
  }
  public double cost() {
    return .20 + beverage.cost();
  }
}

class Whip extends CondimentDecorator {
  Beverage beverage;
  public Whip(Beverage b) {
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription() + ",Whip";
  }
  public double cost() {
    return .10 + beverage.cost();
  }
}

public class StarBuzzCoffee {
  public static void main(String args[]) {
    Beverage b = new DarkRoast();
    
    Beverage md = new Mocha(b);
    Beverage wmd = new Whip(md);
    Beverage wmd2 = new Whip(new Mocha(new DarkRoast()));
    System.out.println(wmd.getDescription());
    System.out.println(wmd.cost());
  }
}

abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}
  
