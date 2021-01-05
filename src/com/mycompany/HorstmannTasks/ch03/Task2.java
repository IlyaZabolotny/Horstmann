package com.mycompany.HorstmannTasks.ch03;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args) {
        Measurable[] employees = {
                new Employee(1000),
                new Employee(4040),
                new Employee(3430)
        };

        Employee employee = (Employee) largest(employees);
        System.out.println(employee);

    }

    private static Measurable largest(Measurable[] objects) {
        Arrays.sort(objects);
        return objects[objects.length-1];
    }
}
