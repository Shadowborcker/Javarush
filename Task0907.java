
/*
Перехватить исключение, возникающее при выполнении кода:
int a = 42 / 0;
Вывести на экран тип перехваченного исключения.


Требования:
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.
*/


package com.company;

import java.util.*;
import java.io.*;


public class Task0907 {

    public static void main(String[] args) throws Exception {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getClass());
        }


    }
}
