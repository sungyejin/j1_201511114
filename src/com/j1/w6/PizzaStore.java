package com.j1.w6;
/*
public class PizzaStore {
  SimplePizzaFactory factory:
    public PizzaStore(SimplePizzaFactory factory) {
    this.factory=factory;
  }
    public Pizza orderPizza(String type) {
      Pizza pizza = factory.createPiiza(type);
      pizza.prepare();
    }
}*/

public abstract class PizzaStore {
  abstract Pizza createPizza(String type);
  public Pizza orderPizza(String type) {
    Pizza pizza=createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
