package com.mycompany.HorstmannTasks.ch01;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.printf("Binary: %s\n", Integer.toString(value,2));
        System.out.printf("Octal: %o\n", value);
        System.out.printf("Hexadecimal: %x\n", value);
        double reciprocal = 1.0 / value;
        System.out.printf("Hexadecimal floating point: %a\n", reciprocal);
    }
}
