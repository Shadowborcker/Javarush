
/*
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.


Требования:
1. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
2. Считай 5 строк с клавиатуры и добавь их в список.
3. Удали третий элемент списка.
4. Выведи элементы на экран, каждый с новой строки.
5. Порядок вывода должен быть обратный.
*/


package com.company;


import java.io.*;
import java.util.*;


public class Task0714 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> List = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            List.add(i, reader.readLine());
        }
        List.remove(2);
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(List.size() - i-1));
        }


    }


}

