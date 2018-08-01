
/*
Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст "Бум!".
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Программа должна выводить обратный отсчет от 30 до 0. Каждую цифру на новой строке.
3. Программа должна выводить "Бум!" после отсчета.
4. Программа должна использовать метод "Thread.sleep(100);" 31 раз.
*/


package com.company;


import java.io.*;
import java.util.*;


public class Task0723 {


    public static void main(String[] args) throws Exception {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }

        System.out.println("Бум!");
    }
}





