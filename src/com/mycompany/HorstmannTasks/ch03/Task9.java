package com.mycompany.HorstmannTasks.ch03;

public class Task9 {

    public static void main(String[] args) {
        Greeter greeter1 = new Greeter(5, "World!");
        Greeter greeter2 = new Greeter(5, "People!");
        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);
        thread1.start();
        thread2.start();
    }
}
