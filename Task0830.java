
/*
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать три метода.
4. Метод main() должен вызывать метод sort().
5. Метод sort() должен вызывать метод isGreaterThan().
6. Выведенные слова должны быть отсортированы в алфавитном порядке.
*/


package com.company;

import java.util.*;
import java.io.*;


public class Task0830 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        String temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (isGreaterThan(array[j], array[j+1])) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}


