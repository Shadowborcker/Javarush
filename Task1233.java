package com.company;

/*
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).


Требования:
1. Класс Solution должен содержать класс Pair.
2. Класс Solution должен содержать два метода.
3. Класс Solution должен содержать метод getMinimumAndIndex().
4. Метод getMinimumAndIndex() должен возвращать минимальное число в массиве и его позицию (индекс).
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1233 {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int[] temp_arr = array.clone();
        int temp;

        for (int i = 0; i < temp_arr.length; i++) {
            for (int j = 0; j < temp_arr.length - 1; j++) {
                if (temp_arr[j] > temp_arr[j + 1]) {
                    temp = temp_arr[j];
                    temp_arr[j] = temp_arr[j + 1];
                    temp_arr[j + 1] = temp;
                }

            }

        }
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (temp_arr[0] == array[i]) {
                index = i;
                break;
            }
        }

        return new Pair<Integer, Integer>(temp_arr[0], index);
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
