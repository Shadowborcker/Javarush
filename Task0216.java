package com.company;

/*
Написать функцию, которая вычисляет минимум из трёх чисел.
 */
public class Task0216 {

    public static int min(int a, int b, int c) {
      if(a<=b && a<=c)
          return a;
      else if (b<=a && b<=c)
          return b;
      else return c;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}