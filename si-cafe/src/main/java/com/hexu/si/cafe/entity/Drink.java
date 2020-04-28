package com.hexu.si.cafe.entity;

import java.io.Serializable;

public class Drink implements Serializable {

    private int orderNumber;

    private boolean iced;


    private int shots;

    private DrinkType drinkType;


    public Drink() {
    }


    public Drink(int orderNumber, boolean iced, int shots, DrinkType drinkType) {
        this.orderNumber = orderNumber;
        this.iced = iced;
        this.shots = shots;
        this.drinkType = drinkType;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public boolean isIced() {
        return iced;
    }

    public void setIced(boolean iced) {
        this.iced = iced;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }


    @Override
    public String toString() {
        return "Drink{" +
                "orderNumber=" + orderNumber +
                ", iced=" + iced +
                ", shots=" + shots +
                ", drinkType=" + drinkType +
                '}';
    }
}
