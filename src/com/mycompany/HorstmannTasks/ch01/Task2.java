package com.mycompany.HorstmannTasks.ch01;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Enter an integer angle (may be positive or negative): ");
        Scanner in = new Scanner(System.in);
        int angle = in.nextInt();
        int normAngle = (angle % 360 + 360) % 360;
        System.out.printf("Normalized angle: %d\n", normAngle);
        normAngle = Math.floorMod(angle, 360);
        System.out.printf("Normalized angle: %d\n", normAngle);
    }
}
