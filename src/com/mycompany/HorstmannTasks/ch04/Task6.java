package com.mycompany.HorstmannTasks.ch04;

public class Task6 {

    public static void main(String[] args) {
        DiscountedItem x = new DiscountedItem("item", 100, 0.02);
        Item y = new Item("item", 100);
        DiscountedItem z = new DiscountedItem("item", 100, 0.05);
        System.out.println("x equals y: " + x.equals(y));
        System.out.println("y equals x: " + y.equals(x));

        System.out.println("x equals y: " + x.equals(y));
        System.out.println("y equals z: " + y.equals(z));
        System.out.println("x equals z: " + x.equals(z));
    }

}
