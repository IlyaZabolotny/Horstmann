package com.mycompany.HorstmannTasks.ch01;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Enter three integers: ");
        Scanner in = new Scanner(System.in);
        int firstNum = in.nextInt();
        int secondNum = in.nextInt();
        int thirdNum = in.nextInt();
        int maxValue = firstNum > secondNum ? firstNum : secondNum > thirdNum ? secondNum : thirdNum;
        System.out.printf("Largest using the conditional operator: %d\n", maxValue);
        maxValue = Math.max(firstNum, Math.max(secondNum, thirdNum));
        System.out.printf("Largest using Math.max: %d\n", maxValue);
    }
}
