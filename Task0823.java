
/*
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
5. Метод getMinimum() должен вернуть минимальное число среди элементов списка.
6. Метод main() должен вызывать метод getIntegerList().
7. Метод main() должен вызывать метод getMinimum().
*/


package com.company;

import java.io.*;
import java.util.*;


public class Task0823 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] arr = s.toCharArray();
        if(arr[0]!=' ')
            arr[0] = Character.toUpperCase(arr[0]);
        for(int i =1; i<arr.length; i++){
            if(arr[i-1] == ' ')
                arr[i] = Character.toUpperCase(arr[i]);
        }
        s = new String(arr);
        System.out.println(s);
    }
}