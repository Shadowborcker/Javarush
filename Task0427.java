package com.company;

/*
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
 */

import java.io.*;

public class Task0427 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int length = (int) (Math.log10(a) + 1);
        {

            if (a % 2 == 0) {
                if (length == 1)
                    System.out.println("четное однозначное число");
                else if (length == 2)
                    System.out.println("четное двузначное число");
                else if (length == 3)
                    System.out.println("четное трехзначное число");

            } if (a % 2 != 0) {
            if (length == 1)
                System.out.println("нечетное однозначное число");
            else if (length == 2)
                System.out.println("нечетное двузначное число");
            else if (length == 3)
                System.out.println("нечетное трехзначное число");
        }

        }


    }
}

