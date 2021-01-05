package com.mycompany.HorstmannTasks.ch01;

import java.math.BigInteger;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        System.out.println("Enter two integers between 0 and 4294967295: ");
        Scanner in = new Scanner(System.in);
        int firstNum =  (int) in.nextLong();
        int secondNum = (int) in.nextLong();

        System.out.printf("Unsigned sum: %d\n", Integer.sum(firstNum, secondNum));
        System.out.printf("Difference: %d\n", firstNum - secondNum);
        System.out.printf("Product: %d\n", firstNum * secondNum);
        System.out.printf("Quotient: %d\n", Integer.divideUnsigned(firstNum, secondNum));
        System.out.printf("Remainder: %d\n", Integer.remainderUnsigned(firstNum,secondNum));

    }

}
