
/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить две строки.
3. Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
4. Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
5. Каждая строка должна заканчиваться пробелом.
*/


package com.company;

import java.io.*;
import java.util.*;
import java.text.*;


public class Task0923 {

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] words = str.replaceAll("\\s+","").toCharArray();
        ArrayList<Character> Vowels = new ArrayList<>();
        ArrayList<Character> NotVowels = new ArrayList<>();
        for (char c : words) {
            if (isVowel(c)) {
                Vowels.add(c);
            }
            else {
                NotVowels.add(c);
            }
        }
        for (Character c : Vowels) {
            System.out.print(c+" ");
        }
        System.out.println();
        for (Character c : NotVowels) {
            System.out.print(c+" ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}