
/*
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.


Требования:
1. Программа должна выводить числа на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать два метода.
4. Метод sort() должен сортировать массив чисел от большего к меньшему.
5. Метод main() должен вызывать метод sort().
6. Программа должна выводить пять наибольших чисел массива. Каждое значение с новой строки.
*/


package com.company;

import java.text.SimpleDateFormat;
import java.util.*;


public class Task0827 {

    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);
        Date currentdate = new Date(date);
        Date yearStartTime = new Date(currentdate.getYear(), 0, 1);
        long msTimeDifference = currentdate.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = 1 + (int) (msTimeDifference / msDay);
        if (dayCount % 2 != 0)
            return true;
        else return false;

    }
}
