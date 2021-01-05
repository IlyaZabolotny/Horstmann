package com.mycompany.HorstmannTasks.ch03;

public class Task5 {
    public static void main(String[] args) {
        IntSequence intSequence = IntSequence.constant(1);
        int limit = 10;
        int counter = 0;
        while (intSequence.hasNext() && counter < limit) {
            System.out.println(intSequence.next());
            counter++;
        }
    }
}
