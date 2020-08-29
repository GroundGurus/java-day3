package com.groundgurus.day3;

public class WineShopMain {

  // Principle
  // accessors/getter -> return the value of an attribute
  // mutators/setter -> set the value of an attribute
  public static void main(String[] args) {
    WineShop wineShop = new WineShop();
    wineShop.setName("Bill & Ted's Winery");
    wineShop.addItem(new Item("San Miguel Beer"));
    wineShop.addItem(new Item("Red Wine"));

//    System.out.println(wineShop.name);
    wineShop.printDetails();
  }
}
