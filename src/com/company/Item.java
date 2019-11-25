package com.company;

public class Item extends Invoice{
private String itemName;
private double price;
private int quantity;
private boolean taxable;

public Item(){}

public Item(String itemName, double price, int quantity, boolean taxable){
    this.itemName = itemName;
    this.price = price;
    this.quantity = quantity;
    this.taxable = taxable;
}


    public String getitemName() {
        return itemName;
    }

    public void setitemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", taxable=" + taxable +
                '}';
    }
}

