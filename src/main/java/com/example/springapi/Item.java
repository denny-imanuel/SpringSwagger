package com.example.springapi;

public class Item {

    String Name;
    Integer Quantity;

    public Item(String name, Integer quantity) {
        Name = name;
        Quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }
}
