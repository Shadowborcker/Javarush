
/*
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать массив на 10 строк.
2. Программа должна создавать массив на 10 целых чисел.
3. Программа должна считывать строки для массива с клавиатуры.
4. Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.
*/


package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Task0703 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array1 = new String[10];
        int[] array2 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = reader.readLine();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i].length();
        }
        for (int i = 0; i <array2.length ; i++) {
            System.out.println(array2[i]);

        }


    }

}
