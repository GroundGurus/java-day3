package com.groundgurus.day3;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
  private String name;
  private String[] ingredients;
  private String manufacturer;
  private Date expirationDate;

  public Item(String name) {
    this.name = name;
  }
}
