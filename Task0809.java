
/*
сть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.

Требования:
1. Объяви переменную коллекции HashMap с типом элементов String, Cat и сразу проинициализируй ee.
2. Программа не должна считывать значения с клавиатуры.
3. Метод addCatsToMap() должен добавлять в коллекцию котов из массива String[] cats, согласно условию.
4. Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.
*/


package com.company;


import java.io.*;
import java.util.*;
import java.util.HashSet;


public class Task0809 {


    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        Date currentTime = new Date();

        insert10000(list);

        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}