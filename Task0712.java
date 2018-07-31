
/*
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.
*/


package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Task0712 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        String str;
        int min = 0;
        int max = 0;

        for (int i = 0; i < 10; i++) {
            str = reader.readLine();
            strings.add(i, str);
            if (min == 0) {
                min = str.length();
            }
            if (str.length() <= min) {
                min = str.length();
            } else if (str.length() >= max) {
                max = str.length();
            }
        }
            for (int j = 0; j < strings.size(); j++) {
                if (strings.get(j).length() == max || strings.get(j).length() == min) {
                    System.out.println(strings.get(j));
                    break;
                }

            }


        }


    }

