package com.mycompany.HorstmannTasks.ch04;

import java.util.Objects;

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject.getClass() == Item.class) return true;
        if (!super.equals(otherObject)) return false;
        DiscountedItem that = (DiscountedItem) otherObject;
        return Double.compare(that.discount, discount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
