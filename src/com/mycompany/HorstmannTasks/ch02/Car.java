package com.mycompany.HorstmannTasks.ch02;

public class Car {

    private int fuelEfficiency;
    private int fuelLevel;
    private int distance;

    public Car(int fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
        this.fuelLevel = 0;
        this.distance = 0;
    }

    public void drive(int miles) {
        distance += Math.min(fuelEfficiency * fuelLevel, miles);
        fuelLevel = Math.max(0, fuelLevel - miles / fuelEfficiency);
    }

    public void addFuel (int gallons) {
        fuelLevel += gallons;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getDistance() {
        return distance;
    }
}
