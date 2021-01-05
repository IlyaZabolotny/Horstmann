package com.mycompany.HorstmannTasks.ch03;

public class Task4 {

    public static void main(String[] args) {
        IntSequence intSequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (intSequence.hasNext()) {
            System.out.println(intSequence.next());
        }
    }
}
