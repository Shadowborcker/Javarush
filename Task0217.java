package com.company;

/*
Минимум четырех чисел
Метод min(a, b, c, d) должен использовать метод min(a, b)
 */
public class Task0217 {

    public static int min(int a, int b, int c, int d) {
        if(min(a,b)<min(c,d))
            return min(a,b);
        else
            return min(c,d);//напишите тут ваш код

    }

    public static int min(int a, int b) {
        if(a<b)
            return a;
        else
            return b;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}