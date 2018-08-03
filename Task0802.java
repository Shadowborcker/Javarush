
/*
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

1. Объяви переменную коллекции HashMap с типом элементов String, String и сразу проинициализируй ee.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
4. Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.
*/


package com.company;


import java.io.*;
import java.util.*;
import java.util.HashSet;


public class Task0802 {


    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

    }
}

