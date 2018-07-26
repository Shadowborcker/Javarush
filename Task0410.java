package com.company;

/*
Напишите метод closeToTen. Метод должен выводить на экран ближайшее к 10
из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11.
Если оба числа на равной длине к 10, то вывести на экран любое из них.
 */

public class Task0410 {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        if (a <= 100 && a >= 50)

            System.out.println("Число а содержится в интервале.");
        else
            System.out.println("Число а не содержится в интервале.");

    }
}