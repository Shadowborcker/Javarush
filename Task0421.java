package com.company;

/*
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.
 */

import java.io.*;

public class Task0421 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();



        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else if (name1.length()==name2.length())
            System.out.println("Длины имен равны");

    }
}

