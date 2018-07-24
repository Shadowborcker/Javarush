package com.company;

/*
Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия. Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF - 32) * 5/9
 */
public class Task0130 {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double F = (9/5.0*celsium+32); //напишите тут ваш код

        return F;
    }
}