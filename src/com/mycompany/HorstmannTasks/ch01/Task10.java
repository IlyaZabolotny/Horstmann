package com.mycompany.HorstmannTasks.ch01;

public class Task10 {


    public static void main(String[] args) {
        int stringLength = 10;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            sb.append(getBoolean() ? getRandom(0, 9) : getLetter());
        }

        String str = sb.toString();
        long sequence = 0;

        for (char c : str.toCharArray()) {
            sequence += c;
        }

        System.out.println("A random long value in base 36: " + Long.toString(sequence, 36));
    }

    private static CharSequence getLetter() {
        return String.valueOf((char) getRandom(97, 122));
    }

    private static int getRandom(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }

    private static boolean getBoolean() {
        return getRandom(0, 1) == 0;
    }
}
