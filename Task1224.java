package com.company;

/*
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
"Кот", "Тигр", "Лев", "Бык", "Животное".


Требования:
1. Класс Solution должен содержать классы Cat, Tiger, Lion, Bull, Pig.
2. Класс Solution должен содержать метод String getObjectType(Object o).
3. Метод getObjectType() должен возвращать строку "Кот" если передан объект типа Cat.
4. Метод getObjectType() должен возвращать строку "Тигр" если передан объект типа Tiger.
5. Метод getObjectType() должен возвращать строку "Лев" если передан объект типа Lion.
6. Метод getObjectType() должен возвращать строку "Бык" если передан объект типа Bull.
7. Метод getObjectType() должен возвращать строку "Животное" если передан любой другой объект.
8. Программа должна выводить на экран результат метода getObjectType().
*/

public class Task1224 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String name = "Животное";
        if (o instanceof Cat) {
            name = ((Cat) o).name;
        }
        if (o instanceof Tiger) {
            name = ((Tiger) o).name;
        }
        if (o instanceof Lion) {
            name = ((Lion) o).name;
        }
        if (o instanceof Bull) {
            name = ((Bull) o).name;
        }
        return name;
    }

    public static class Cat {
        public String name = "Кот";
    }

    public static class Tiger {
        public String name = "Тигр";
    }

    public static class Lion {
        public String name = "Лев";
    }

    public static class Bull {
        public String name = "Бык";
    }

    public static class Pig {
    }
}
