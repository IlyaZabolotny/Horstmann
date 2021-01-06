package com.mycompany.HorstmannTasks.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task13 {

    public static void main(String[] args) {

        Random generator = new Random();
        int[] result = new int[6];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 49; i++) {
            arrayList.add(i+1);
        }

        int counter = 0;
        while (counter < 6 ) {
            int index = generator.nextInt(arrayList.size());
            result[counter] = arrayList.get(index);
            arrayList.remove(index);
            counter ++;
        }

        Arrays.sort(result);
        System.out.println("A sorted lottery combination: " + Arrays.toString(result));

    }


}
