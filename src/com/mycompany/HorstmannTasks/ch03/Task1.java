package com.mycompany.HorstmannTasks.ch03;

public class Task1 {

    public static void main(String[] args) {
        Measurable[] employees = {
                new Employee(1200),
                new Employee(4040),
                new Employee(500)
        };

        System.out.println(average(employees));

    }

    private static double average(Measurable[] objects) {
        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        return sum / objects.length;
    }

}
