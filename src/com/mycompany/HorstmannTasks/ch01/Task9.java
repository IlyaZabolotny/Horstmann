package com.mycompany.HorstmannTasks.ch01;

public class Task9 {

    public static void main(String[] args) {
        String location = String.join("","W", "or", "ld");
        System.out.printf("%s %s", location == "World", "World".equals(location));
    }
}
