
/*
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
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
