package com.hexu.si.cafe.entity;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {

    private int number;

    private List<OderItem> oderItems;

    public Order() {
    }

    public Order(int number, List<OderItem> oderItems) {
        this.number = number;
        this.oderItems = oderItems;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<OderItem> getOderItems() {
        return oderItems;
    }

    public void setOderItems(List<OderItem> oderItems) {
        this.oderItems = oderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", oderItems=" + oderItems +
                '}';
    }
}
