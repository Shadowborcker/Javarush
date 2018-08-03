
/*
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время своего исполнения в миллисекундах.


Требования:
1. Программа должна выводить числа на экран.
2. Метод main должен вызывать метод getTimeMsOfInsert только два раза.
3. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
4. Метод getTimeMsOfInsert должен вызывать метод insert10000 только один раз.
5. Метод getTimeMsOfInsert должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.
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