package com.company;

/*
Реализуй интерфейс Drink в классах Beer и Cola.


Требования:
1. Класс Beer должен реализовывать(implements) интерфейс Drink.
2. Класс Cola должен реализовывать(implements) интерфейс Drink.
3. В классе Beer должны быть реализованы все методы интерфейса Drink.
4. В классе Cola должны быть реализованы все методы интерфейса Drink.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1303 {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink {
        public boolean isAlcoholic() {
            return true;
        }
}

    public static class Cola implements Drink {
        public boolean isAlcoholic() {
            return false;
        }
    }
}
