package com.mycompany.HorstmannTasks.ch01;

import java.math.BigInteger;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        System.out.println("Enter two integers between 0 and 4294967295: ");
        Scanner in = new Scanner(System.in);
        int firstNum =  (int) in.nextLong();
        int secondNum = (int) in.nextLong();

        System.out.printf("Unsigned sum: %d\n", Math.abs(Integer.sum(firstNum, secondNum)));
        System.out.printf("Difference: %d\n", Math.abs(firstNum - secondNum));
        System.out.printf("Product: %d\n", Math.abs(firstNum * secondNum));
        System.out.printf("Quotient: %d\n", Math.abs(Integer.divideUnsigned(firstNum, secondNum)));
        System.out.printf("Remainder: %d\n", Math.abs(Integer.remainderUnsigned(firstNum,secondNum)));

    }

}
