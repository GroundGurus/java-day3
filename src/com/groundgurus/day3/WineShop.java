package com.groundgurus.day3;

public class WineShop extends Shop {
  private boolean areMinorsAllowed;

  // method overriding
  public void printDetails() {
    super.printDetails();
    System.out.println("Are minors allowed? " + areMinorsAllowed);
  }
}
