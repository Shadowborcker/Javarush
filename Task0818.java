
/*
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/


package com.company;


import java.io.*;
import java.util.*;


public class Task0818 {


    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Black", 217);
        map.put("O'connor", 715);
        map.put("Jameson", 2015);
        map.put("Roberts", 212);
        map.put("Tompson", 1445);
        map.put("Lloyd", 223);
        map.put("Skywalker", 704);
        map.put("Jade", 212);
        map.put("Lynch", 366);
        map.put("Zayne", 972);
        return map;
    }


    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

        /*
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }
        */

    }
}
