package com.mycompany.HorstmannTasks.ch03;

public class Task10 {
    public static void main(String[] args) {
        Greeter[] g = new Greeter[3];
        g[0] = new Greeter(10, "1");
        g[1] = new Greeter(4,"2");
        g[2] = new Greeter(5, "3");
        runTogether(g);

        //runInOrder(g);
    }

    public static void runTogether(Runnable... tasks) {
        Thread[] threads = new Thread[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            new Thread(tasks[i]).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        Thread[] threads = new Thread[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            new Thread(tasks[i]).run();
        }
    }
}
