package com.company;

/*
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа не должна ничего читать из файловой системы.
4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
6. Метод main должен закрывать объект типа BufferedWriter после использования.
7. Метод main не должен выводить данные на экран.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1319 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        List<String> list = new ArrayList<>();
        while (true) {
            String string = bufferedReader.readLine();
            list.add(string);
            if (string.equals("exit")) {
                break;
            }
        }
        for (String string : list) {
            bufferedWriter.write(string+"\n");
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}