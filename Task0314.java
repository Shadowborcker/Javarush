package com.company;

/*
Коротко о моём отношении к работе.
 */
public class Task0314 {

    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            while (j <= 9) {
                j++;
                System.out.print(i * j + " ");
            }
            i++;
            j = 1;
            System.out.println("");

        }
    }
}