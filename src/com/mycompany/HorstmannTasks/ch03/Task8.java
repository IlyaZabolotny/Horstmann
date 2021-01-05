package com.mycompany.HorstmannTasks.ch03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task8 {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        luckySort(strings, Comparator.comparingInt(String::length));

    }



    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {

        boolean done = false;
        while (!done) {
            Collections.shuffle(strings);
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i + 1), strings.get(i)) < 0) {
                    System.out.println(strings);
                    done = true;
                }
            }
        }
    }

}