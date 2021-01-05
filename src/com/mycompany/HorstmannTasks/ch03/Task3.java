package com.mycompany.HorstmannTasks.ch03;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.lang.invoke.SerializedLambda;
import java.util.Iterator;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        /**
         * String: Serializable, CharSequence, Comparable<String>, Constable, ConstantDesc
         * Scanner: Closeable, AutoCloseable, Iterator<String>
         * ImageOutputStream: AutoCloseable, Closeable, DataInput, DataOutput, ImageInputStream
         */
        String str = "";
        System.out.println(str instanceof Serializable);
        System.out.println(str instanceof Comparable);
        System.out.println(str instanceof CharSequence);
        System.out.println(str instanceof Constable);
        System.out.println(str instanceof ConstantDesc);

        Scanner in = new Scanner(System.in);
        System.out.println(in instanceof Iterator);
        System.out.println(in instanceof Closeable);
        System.out.println(in instanceof AutoCloseable);

    }
}
