package com.mycompany.HorstmannTasks.ch01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task14 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the matrix size: ");
        int length = in.nextInt();
        int[][] square = new int[length][length];
        System.out.print("Enter values: ");
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {
                square[i][j] = in.nextInt();
            }
        }

        for (int[] ints : square) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println(isMagicSquare(square) ? "It`s a magic square" : "It`s ordinary square");
    }

    private static boolean isMagicSquare(int[][] square) {
        HashSet<Integer> set = new HashSet<>();
        //rows
        for (int[] ints : square) {
            set.add(IntStream.of(ints).sum());
        }
        //columns
        for (int i = 0; i < square.length; i++) {
            int s = 0;
            for (int j = 0; j < square[0].length; j++) {
                s += square[j][i];
            }
            set.add(s);
        }
        //diagonals
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < square.length; i++) {
            d1 += square[i][i];
            d2 += square[i][square.length - 1 - i];
        }
        set.add(d1);
        set.add(d2);
        return set.size() <= 1;
    }
}
