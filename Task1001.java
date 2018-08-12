
/*
Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);


Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную a типа int.
4. Метод main() должен содержать переменную b типа int.
5. Метод main() должен содержать переменную c типа byte.
6. Метод main() должен содержать переменную f типа double.
7. Метод main() должен содержать переменную d типа long.
8. Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
9. Программа должна выводить число больше, чем 0.
*/


package com.company;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.*;
import java.text.*;


public class Task1001 {

    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (char) (a + f / c + b);
        System.out.println(d);
    }
}