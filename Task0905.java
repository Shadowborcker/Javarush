
/*
Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.


Требования:
1. Метод getStackTraceDeep должен возвращать глубину своего стек-трейса.
2. Метод getStackTraceDeep должен выводить на экран глубину своего стек-трейса.
3. Воспользуйся методом Thread.currentThread().getStackTrace().
4. Метод main должен вызывать метод getStackTraceDeep.
*/


package com.company;

import java.util.*;
import java.io.*;


public class Task0905 {

    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        int l = Thread.currentThread().getStackTrace().length;
        System.out.println(l);
        return l;

    }
}

