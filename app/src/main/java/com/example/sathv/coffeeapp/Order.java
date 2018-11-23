package com.example.sathv.coffeeapp;

/**
 * Created by sathv on 11/23/2018.
 */

public class Order {
    String generalname, price, quantity, addons, nameonorder;

    public Order(String generalname, String price, String quantity, String addons, String nameonorder) {
        this.generalname = generalname;
        this.price = price;
        this.quantity = quantity;
        this.addons = addons;
        this.nameonorder = nameonorder;
    }

    public String getNameonorder() {
        return nameonorder;
    }

    public void setNameonorder(String nameonorder) {
        this.nameonorder = nameonorder;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAddons() {
        return addons;
    }

    public void setAddons(String addons) {
        this.addons = addons;
    }

    public String getGeneralname() {
        return generalname;
    }

    public void setGeneralname(String generalname) {
        this.generalname = generalname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
