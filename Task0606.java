
/*
Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение:
"Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.
 */


package com.company;
import java.io.*;



public class Task0606 {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        even = 0;
        odd =0;

        while (num>0) {
            if (num%2==0)
                even++;
            else
                odd++;
            num /= 10;
        }
        System.out.println("Even: " + even + " Odd: "+ odd);
    }
}
