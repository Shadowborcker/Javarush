
/*
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.


Требования:
1. Программа должна создавать массив на 10 строк.
2. Программа должна считывать 8 строк для массива с клавиатуры.
3. Программа должна выводить 10 строк, каждую с новой строки.
4. Все строки массива (10 элементов) должны быть выведены в обратном порядке.
 */


package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Task0702 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0; i < array.length-2; i++) {
            array[i] = reader.readLine();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[array.length-1-i]);

        }


    }

}
