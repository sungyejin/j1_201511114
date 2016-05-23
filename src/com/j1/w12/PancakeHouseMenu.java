package com.j1.w12;


public class DinnerMenu {
  //static final int MAX_ITEMS=6;
  //int numberOfItems=0;
  //MenuItem[] menuItems;
  ArrayList menuItems;
  public DinerMenu() {
    //menuItems=new MenuItem[MAX_ITEMS];
    menuItems=new ArrayList();
    addItem("BLT","...",true,2.9);
    addItem("BLT","...",true,2.9);
    addItem("BLT","...",true,2.9);
  }
  
  public void addItem(String name,String description,boolean vegetarian,double price){
    MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
    //if(numberOfItems>=MAX_ITEMS){
    //  System.err.println("Error");
    //}else{
    //  menuItems[numberOfItems]=menuItem;
    //  numberOfItems=numberOfItems+1;
    //}
  }
  menuItems.add(menuItem);
}

  