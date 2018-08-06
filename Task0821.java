
/*
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать только три метода.
3. Метод createPeopleList() должен создавать и возвращать словарь Map с типом элементов String, String. Кроме того, добавлять в словарь 10 человек.
4. В методе createPeopleList() должны добавляться люди с одинаковыми фамилиями.
5. В методе createPeopleList() должны добавляться люди с одинаковыми именами.
6. Метод printPeopleList() должен выводить на экран всех людей из словаря Map. Каждое значение вывести с новой строки. Фамилия и имя разделены пробелом.
7. Метод main() должен вызывать метод createPeopleList().
8. Метод main() должен вызывать метод printPeopleList().
*/


package com.company;


import java.util.*;


public class Task0821 {


    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Black", "Jack");
        map.put("Black", "Joe");
        map.put("Brown", "Emmeth");
        map.put("Mcfly", "Emmeth");
        map.put("Rolling", "Stone");
        map.put("Idont", "Know");
        map.put("Hatethis", "Crap");
        map.put("Tiredof", "This");
        map.put("Really", "Annoying");
        map.put("Last", "One");


        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
