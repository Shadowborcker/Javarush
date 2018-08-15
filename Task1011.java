
/*
Вывести на экран надпись "Я не хочу изучать Java, я хочу большую зарплату" 40 раз по образцу.

Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
...
зарплату


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна выводить 40 строк.
3. В программе должен использоваться цикл for или while.
4. Выведенный текст должен соответствовать примеру из условия.
*/


package com.company;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.*;
import java.text.*;


public class Task1011 {

    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] array = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            list.add(array[i]);
        }
        System.out.println(s);
        for (int i = 0; i <39; i++) {
            list.remove(0);
            for (Character e: list) {
                System.out.print(e);
            }
            System.out.println();
        }

    }

}

