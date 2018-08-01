
/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int),
отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human,
то именно он будет использоваться при выводе объекта на экран.

Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
*/


package com.company;


import java.io.*;
import java.util.*;


public class Task0724 {


    public static void main(String[] args) {
        Human Vasya = new Human("Вася", true, 39);
        Human Dasha = new Human("Даша", false, 25);
        Human Misha = new Human("Миша", true, 42);
        Human Katia = new Human("Катя", false, 37);
        Human Alena = new Human("Алёна", false, 17, Vasya, Katia);
        Human Dima = new Human("Дима", true, 18, Vasya, Katia);
        Human Vika = new Human("Вика", false, 15, Misha, Dasha);
        Human Kolya = new Human("Коля", true, 22, Misha, Dasha);
        Human Sasha = new Human("Саша", false, 5, Misha, Dasha);
        System.out.println(Vasya.toString());
        System.out.println(Dasha.toString());
        System.out.println(Misha.toString());
        System.out.println(Katia.toString());
        System.out.println(Alena.toString());
        System.out.println(Dima.toString());
        System.out.println(Vika.toString());
        System.out.println(Kolya.toString());
        System.out.println(Sasha.toString());


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}


