package com.company;

/*
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
 */

import java.io.*;

public class Task0419 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1 = reader.readLine();
        double a = Double.parseDouble(a1);
        String b1 = reader.readLine();
        double b = Double.parseDouble(b1);
        String c1 = reader.readLine();
        double c = Double.parseDouble(c1);
        String d1 = reader.readLine();
        double d = Double.parseDouble(d1);


        double x = Max(a, b);
        double y = Max(c, d);

        System.out.println(Max(x, y));
    }

    public static double Max(double a, double b)    {
        if (a > b || a == b) {
            return a;
        } else {
            return b;
        }
    }

}