
/*
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. В программе должна быть объявлена переменная типа SimpleDateFormat.
3. В программе должна быть объявлена переменная типа Date.
4. Программа должна выводить данные на экран.
5. Вывод должен соответствовать заданию.
*/


package com.company;

import java.io.*;
import java.util.*;
import java.text.*;


public class Task0922 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = null;
        while (date == null) {
            String line = reader.readLine();
            try {
                date = format.parse(line);
            } catch (ParseException e) {
                System.out.println("Sorry, that's not valid. Please try again.");
            }
        }
        SimpleDateFormat newformat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(newformat.format(date).toUpperCase());

    }
}
