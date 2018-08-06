
/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/


package com.company;


import java.io.*;
import java.util.*;


public class Task0817 {


    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Black", "Jack");
        map.put("Wolf", "Timmi");
        map.put("O'connor", "James");
        map.put("Brown", "Jack");
        map.put("Killian", "Murphy");
        map.put("Tompson", "Lloyd");
        map.put("Skywalker", "Cade");
        map.put("Jade", "Mara");
        map.put("Lynch", "James");
        map.put("Zayne", "Carrick");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map< String, String > map) {
        HashMap< String, String>  copy = new HashMap< >(map);
        for (Map.Entry< String, String > entry : copy.entrySet()) {
            for (Map.Entry< String, String > maps : map.entrySet()) {
                if (entry.getValue().equals(maps.getValue()) && !entry.getKey().equals(maps.getKey())) {
                    removeItemFromMapByValue(map, entry.getValue());
                    break;
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
