package com.mycompany.HorstmannTasks.ch01;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner in = new Scanner(System.in);
        String value = in.nextLine();
        String[] result = value.split("\\s+");
        for (String str: result) {
            System.out.println(str);
        }
    }
}
