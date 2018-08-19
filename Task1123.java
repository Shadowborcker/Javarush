
/*
Изменить три класса: Judaism (Иудаизм), Christianity (Христианство), Islam (Мусульманство).
Унаследовать христианство от иудаизма и мусульманство от христианства.


Требования:
1. В классе Solution должен быть public класс Judaism (Иудаизм).
2. В классе Solution должен быть public класс Christianity (Христианство).
3. В классе Solution должен быть public класс Islam (Мусульманство).
4. Класс Christianity должен быть унаследован от класса Judaism.
5. Класс Islam должен быть унаследован от класса Christianity.
*/


package com.company;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.*;
import java.text.*;


public class Task1123 {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int n = array.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {

                if (array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }


        return new Pair<Integer, Integer>(array[0], array[array.length-1]);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}