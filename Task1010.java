
/*
Добавить одну операцию по преобразованию типа, чтобы получался ответ: d=1.0.


Требования:
1. Программа должна выводить текст на экран.
2. Нельзя менять команду вывода на экран.
3. Метод main() должен содержать переменную a типа int.
4. Метод main() должен содержать переменную b типа int.
5. Метод main() должен содержать переменную c типа int.
6. Метод main() должен содержать переменную e типа int.
7. Метод main() должен содержать переменную d типа double.
8. Значения переменных менять нельзя. Можно добавлять только операторы приведения типа.
9. Программа должна выводить число 1.0.
*/


package com.company;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.*;
import java.text.*;


public class Task1010 {

    public static void main(String[] args) {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte)a + b / c / e;

        System.out.println(d);
    }
}