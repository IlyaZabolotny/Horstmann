package com.mycompany.HorstmannTasks.ch01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task14 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter line by line a two-dimensional array of integers: ");

        int[] iLine = {};
        boolean done = false;
        while (!done) {
        try {
            String line = in.nextLine();
            String[] sLine = line.split(" ");
            iLine = Arrays.stream(sLine).mapToInt(Integer::parseInt).toArray();
            done = true;
        } catch (NumberFormatException exception) {
            System.out.println("Input a line of integers again.");
        }
        }

        int length = iLine.length;
        int[][] square = new int[length][length];
        for (int i = 0; i<length; i++) {
            square[0][i] = iLine[i];
        }
        int counter = 1;
        while (counter < length) {
            String line = in.nextLine();
            String[] sLine = line.split(" ");
            try {
                iLine = Arrays.stream(sLine).mapToInt(Integer::parseInt).toArray();
                if (iLine.length != length) {
                    System.out.println("The number of integers in the line should be equals to " + length);
                    continue;
                }
                for (int i = 0; i < length; i++) {
                    square[counter][i] = iLine[i];
                }
                counter++;
            } catch (NumberFormatException exception) {
                System.out.println("Input a line of integers again.");
            }
        }

        System.out.println(isMagicSquare(square) ? "It`s a magic square" : "It`s an ordinary square");
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
