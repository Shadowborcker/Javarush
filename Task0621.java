
/*
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
 */


package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task0621 {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String grandfatherName = reader.readLine();
            Cat catGrandfather = new Cat(grandfatherName);

            String grandmotherName = reader.readLine();
            Cat catGrandmother = new Cat(grandmotherName);

            String fatherName = reader.readLine();
            Cat catFather = new Cat(fatherName, null, catGrandfather);

            String motherName = reader.readLine();
            Cat catMother = new Cat(motherName, catGrandmother, null);

            String sonName = reader.readLine();
            Cat catSon = new Cat(sonName, catMother, catFather);

            String daughterName = reader.readLine();
            Cat catDaughter = new Cat(daughterName, catMother, catFather);

            System.out.println(catGrandfather);
            System.out.println(catGrandmother);
            System.out.println(catFather);
            System.out.println(catMother);
            System.out.println(catSon);
            System.out.println(catDaughter);
        }

        public static class Cat {
            private String name;
            private Cat mother;
            private Cat father;

            Cat(String name) {
                this.name = name;
            }

            Cat(String name, Cat mother, Cat father) {
                this.name = name;
                this.mother = mother;
                this.father = father;
            }
            @Override
            public String toString() {
                if (mother == null && father == null)
                    return "Cat name is " + name + ", no mother " + ", no father";
                else if (mother == null && father !=null)
                    return "Cat name is " + name + ", no mother" +", father is "+father.name;
                else if (mother != null && father ==null)
                    return "Cat name is " + name +", mother is "+mother.name + ", no father";
                else
                    return "Cat name is " + name +", mother is "+mother.name +", father is "+father.name;
            }
        }

    }