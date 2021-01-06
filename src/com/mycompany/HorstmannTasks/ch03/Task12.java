package com.mycompany.HorstmannTasks.ch03;

import java.io.File;
import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
        String dir = "src/com/mycompany/HorstmannTasks/ch03";
        System.out.println(Arrays.toString(getFiles(dir, ".txt")));
    }

    private static String[] getFiles(String path, String extension) {
        return new File(path).list((dir, name) -> name.endsWith(extension));
    }
}
