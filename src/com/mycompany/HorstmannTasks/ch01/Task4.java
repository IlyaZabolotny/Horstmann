package com.mycompany.HorstmannTasks.ch01;

public class Task4 {

    public static void main(String[] args) {

        System.out.printf("Smallest positive double: %g\n", Math.nextUp(0.0));
        System.out.printf("Smallest positive double: %g\n", Double.MIN_VALUE);
        System.out.printf("Largest positive double: %g\n", Math.nextDown(Double.POSITIVE_INFINITY));
        System.out.printf("Largest positive double: %g\n", Double.MAX_VALUE);

    }
}
