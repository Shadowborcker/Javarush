
/*
Расставьте правильно операторы приведения типа, чтобы получился ответ: d=3.765
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;


Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную a типа int.
4. Метод main() должен содержать переменную b типа int.
5. Метод main() должен содержать переменную c типа float.
6. Метод main() должен содержать переменную d типа double.
7. Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
8. Программа должна выводить число 3.765.
*/


package com.company;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.*;
import java.text.*;


public class Task1002 {

    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}
