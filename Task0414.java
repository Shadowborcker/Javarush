package com.company;

/*
Подсказка:
В високосном году - 366 дней, тогда как в обычном - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 - не високосные.
 */

import java.io.*;

public class Task0414 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String c = reader.readLine();
        int a = Integer.parseInt(c);

        if (a % 4 == 0 && (a % 100 != 0 || (a % 100 == 0 && a % 400 == 0))) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}