package com.groundgurus.day3;

// Go to definition, press Ctrl+b
public class Shop {
  private String name;
  private Item[] items = new Item[10]; // empty array
  private int count; // 0

  public void addItem(Item item) {
    items[count] = item;
    count++;
  }

  public Item findByItemName(String name) {
    for (Item item : items) {
      if (item != null &&
          item.getName().toLowerCase().startsWith(name.toLowerCase())) {
        return item;
      }
    }

    return null;
  }

  public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Items");

    for (Item item : items) {
      if (item != null) {
        System.out.println("-- " + item.getName());
      }
    }
  }

  // Windows, Alt + Insert
  // Mac, Cmd + Enter
  // Netbeans, Right Click, Generate something...
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Item[] getItems() {
    return items;
  }

  public void setItems(Item[] items) {
    this.items = items;
  }
}
