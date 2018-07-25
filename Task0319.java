package com.company;

/*
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.
 */
import java.io.*;
public class Task0319 {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sMoney = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        int nMoney = Integer.parseInt(sMoney);
        System.out.println(name +" получает "+ nMoney + " через " + nAge + " лет.");

    }
}
