package com.mycompany.HorstmannTasks.ch01;

public class Task5 {

    public static void main(String[] args) {

        // will be lose of information
        double largerIntMax = 1.0 + Integer.MAX_VALUE;
        System.out.printf("The result of cast a double %g to an int: %d \n", largerIntMax, (int) largerIntMax);
    }
}
