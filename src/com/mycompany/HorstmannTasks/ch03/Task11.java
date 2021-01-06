package com.mycompany.HorstmannTasks.ch03;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        String path = "src/com/mycompany/HorstmannTasks";
        System.out.println(Arrays.toString(getSubdirectories(path)));
        System.out.println(Arrays.toString(getSubdirectoriesL(path)));
        System.out.println(Arrays.toString(getSubdirectoriesInner(path)));
    }

    private static File[] getSubdirectories(String path) {
        File[] dirs = new File(path).listFiles(File::isDirectory);
        return dirs;
    }

    private static File[] getSubdirectoriesL (String path) {
        File[] dirs = new File(path).listFiles(f -> f.isDirectory());
        return dirs;
    }

    private static File[] getSubdirectoriesInner (String path) {
        return new File(path).listFiles(new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }
}
