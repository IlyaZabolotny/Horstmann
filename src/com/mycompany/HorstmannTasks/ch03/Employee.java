package com.mycompany.HorstmannTasks.ch03;

public class Employee implements  Measurable, Comparable<Employee> {

    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getMeasure() {
        return salary;
    }

    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
