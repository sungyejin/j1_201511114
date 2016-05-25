package com.j1.w12;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian; //jsl20151122: used in isVegetarian() and for waitress to order
    double price;
 
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return (name + ", $" + price + "\n   " + description);
    }
}
