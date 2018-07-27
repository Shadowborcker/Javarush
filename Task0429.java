package com.company;

/*
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.
 */

import java.io.*;

public class Task0429 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int i = 0;
        int j = 0;
        {

            if (a > 0)
                i++;
            else if (a < 0)
                j++;

            if (b > 0)
                i++;
            else if (b < 0)
                j++;

            if (c > 0)
                i++;
            else if (c < 0)
            j++;
        }
        System.out.println("количество отрицательных чисел: " + j);
        System.out.println("количество положительных чисел: " + i);

    }
}

