
/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/


package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Task0708 {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(i, (reader.readLine()));
            if (strings.get(i).length() > max)
                max = strings.get(i).length();
        }
        for (int i = 0; i < strings.size() ; i++) {
            if (strings.get(i).length() == max)
                System.out.println(strings.get(i));
        }


    }
}
