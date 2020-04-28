package com.hexu.si.cafe.entity;

import java.io.Serializable;

public class OderItem implements Serializable {

    private int shots = 1;

    private int orderNumber;

    private DrinkType drinkType;

    private boolean iced;


    public OderItem() {
    }

    public OderItem(int shots, int orderNumber, DrinkType drinkType, boolean iced) {
        this.shots = shots;
        this.orderNumber = orderNumber;
        this.drinkType = drinkType;
        this.iced = iced;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public boolean isIced() {
        return iced;
    }

    public void setIced(boolean iced) {
        this.iced = iced;
    }

    @Override
    public String toString() {
        return "OderItem{" +
                "shots=" + shots +
                ", orderNumber=" + orderNumber +
                ", drinkType=" + drinkType +
                ", iced=" + iced +
                '}';
    }
}
