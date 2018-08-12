
/*
Убери ненужные операторы приведения типа, чтобы получился ответ: result: 1000.0
double d = (short) 2.50256e2d;
char c = (short) 'd';
short s = (short) 2.22;
int i = (short) 150000;
float f = (short) 0.50f;
double result = f + (i / c) - (d * s) - 500e-3;


Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную c типа char.
4. Метод main() должен содержать переменную s типа short.
5. Метод main() должен содержать переменную i типа int.
6. Метод main() должен содержать переменную f типа float.
7. Метод main() должен содержать переменную d типа double.
8. Метод main() должен содержать переменную result типа double.
9. Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
10. Программа должна выводить текст "result: 1000.0".
*/


package com.company;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.*;
import java.text.*;


public class Task1006 {

    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
        char c = (short) 'd';
        short s = (short) 2.22;
        int i = (int) 150000;
        float f = (float) 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
}