package com.company;

/*
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
 */

import java.io.*;

public class Task0434 {

    public static void main(String[] args) throws Exception {

        int i = 1;
        int n = 1;


        while (i <= 10) {
            while (n<=10) {
                System.out.print(i*n+" ");
                n++;
            }
            System.out.println("");
            i++;
            n=1;
        }



    }
}

