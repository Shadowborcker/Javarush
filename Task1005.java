
/*
Расставьте правильно операторы приведения типа, чтобы получился ответ: c=256
int a = (byte)44;
int b = (byte)300;
short c = (byte)(b - a);


Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную a типа int.
4. Метод main() должен содержать переменную b типа int.
5. Метод main() должен содержать переменную c типа short.
6. Начальное значение переменных при инициализации менять нельзя. Можно изменять только операторы приведения типа.
7. Программа должна выводить число 256.
*/


package com.company;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.*;
import java.text.*;


public class Task1005 {

    public static void main(String[] args) {
        int a = (byte) 44;
        int b = (short) 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}