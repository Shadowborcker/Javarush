
/*
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
 */


package com.company;


import java.io.*;

public class Task0507 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double result = 0;
        int i = 0;
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a != -1) {
                result += a;
                i++;
            } else
                break;
        }
        System.out.println(result/i);
    }
}

