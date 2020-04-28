package com.hexu.si.cafe.entity;

import java.io.Serializable;
import java.util.List;

public class Delivery implements Serializable {


    private String SPARATOR = "8************";

    private int orderNumber;

    private List<Drink> deliveriedDrinks;


    public Delivery() {
    }

    public String getSPARATOR() {
        return SPARATOR;
    }

    public void setSPARATOR(String SPARATOR) {
        this.SPARATOR = SPARATOR;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<Drink> getDeliveriedDrinks() {
        return deliveriedDrinks;
    }

    public void setDeliveriedDrinks(List<Drink> deliveriedDrinks) {
        this.deliveriedDrinks = deliveriedDrinks;
    }


    @Override
    public String toString() {
        return "Delivery{" +
                "SPARATOR='" + SPARATOR + '\'' +
                ", orderNumber=" + orderNumber +
                ", deliveriedDrinks=" + deliveriedDrinks +
                '}';
    }
}
