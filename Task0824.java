
/*
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/


package com.company;

import java.io.*;
import java.util.*;


public class Task0824 {

    public static void main(String[] args) {
        Human Vika = new Human("Вика", false, 18, new ArrayList<Human>());
        Human Olga = new Human("ольга", false, 15, new ArrayList<Human>());
        Human Boris = new Human("Борис", true, 23, new ArrayList<Human>());
        ArrayList<Human> littleones = new ArrayList<>();
        littleones.add(Vika);
        littleones.add(Olga);
        littleones.add(Boris);
        Human Nikolay = new Human("Николай", true, 54, littleones);
        ArrayList<Human> father = new ArrayList<>();
        father.add(Nikolay);
        Human Katya = new Human("Катя", false, 43, littleones);
        ArrayList<Human> mother = new ArrayList<>();
        mother.add(Katya);
        Human Ivan = new Human("Иван", true, 89, father);
        Human Dmitri = new Human("Дмитрий", true, 76, mother);
        Human Maria = new Human("Мария", false, 79, father);
        Human Daria = new Human("Дарья", false, 72, mother);
        System.out.println(Ivan);
        System.out.println(Dmitri);
        System.out.println(Maria);
        System.out.println(Daria);
        System.out.println(Nikolay);
        System.out.println(Katya);
        System.out.println(Vika);
        System.out.println(Olga);
        System.out.println(Boris);


    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}