
/*
Реализовать статический метод double getDistance(x1, y1, x2, y2).
Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a),
который вычисляет квадратный корень переданного параметра.


Требования:
1. Метод getDistance должен возвращать double.
2. Метод getDistance должен быть статическим.
3. Метод getDistance должен быть public.
4. Метод getDistance должен возвращать расстояние между точками.
5. Метод getDistance должен использовать метод double Math.sqrt(double a).
 */


package com.company;
import java.io.*;



public class Task0609 {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double l = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
       return l;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine());
        int y1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int y2 = Integer.parseInt(reader.readLine());

        System.out.println(getDistance(x1, y1, x2, y2));

    }
}


