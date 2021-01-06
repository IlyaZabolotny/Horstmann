package com.mycompany.HorstmannTasks.ch03;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Task13 {

    public static void main(String[] args) {
        File[] files = new File("src/com/mycompany/HorstmannTasks/ch03/").listFiles();
        sort(files);
        System.out.println(Arrays.toString(files));
    }

    private static void sort(File[] files) {
        Arrays.sort(files, Comparator.comparing(File::isFile).thenComparing(File::getPath));
    }
}
