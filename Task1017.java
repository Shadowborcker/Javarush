
/*
Создать список целых чисел.
Ввести с клавиатуры 20 целых чисел.
Создать метод по безопасному извлечению чисел из списка:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
Метод должен возвращать элемент списка (list) по его индексу (index).
Если в процессе получения элемента возникло исключение, его нужно перехватить, и метод должен вернуть defaultValue.


Требования:
1. Программа должна считывать 20 чисел с клавиатуры.
2. Программа должна выводить данные на экран.
3. Метод safeGetElement должен возвращать элемент списка по индексу, если исключений внутри метода не возникло.
4. Метод safeGetElement должен возвращать defaultValue, если возникло исключений внутри метода. Исключение перехватить.
5. Метод safeGetElement не должен кидать исключения.
*/


package com.company;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.*;
import java.text.*;


public class Task1017 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        try {
            return list.get(index);
        } catch (Exception e) {
            return defaultValue;
        }
    }

}
