
/*
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9


Требования:
1. Программа должна 10 раз считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
*/


package com.company;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.*;
import java.text.*;


public class Task1012 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        Map<Character, Integer> counts = getCharFreq(list);

        // вывод количества повторений на экран
        for (int i = 0; i < alphabet.size(); i++) {
            if (counts.get(alphabet.get(i)) != null) {
                System.out.println(alphabet.get(i) + " " + counts.get(alphabet.get(i)));
            } else {
                System.out.println(alphabet.get(i) + " " + 0);
            }
        }

    }
    // подсчет повторений символа в строке.
    public static Map<Character, Integer> getCharFreq(ArrayList<String> list) {
        Map<Character, Integer> charFreq = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                for (Character c : list.get(i).toCharArray()) {
                    Integer count = charFreq.get(c);
                    int newCount = (count == null ? 1 : count + 1);
                    charFreq.put(c, newCount);
                }
            }

        }
        return charFreq;

    }

}
