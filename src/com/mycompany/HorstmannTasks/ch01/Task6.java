package com.mycompany.HorstmannTasks.ch01;

import java.math.BigInteger;

public class Task6 {

    public static void main(String[] args) {
        System.out.printf("1000! is: %d\n", factorial(1000));

    }

    public static BigInteger factorial (int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger result = new BigInteger("1");
            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }
}
